package com.grohvlad.result;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Result_n implements IResult{
    private ArrayList<Double> results;
    public Result_n(){
        this.results = new ArrayList<>();
    }

    private void addResult(IResult resultToAdd) {

        this.results.addAll(resultToAdd.getResult());
        Set<Double> set = new HashSet<>(this.results);
        this.results.clear();
        this.results.addAll(set);
    }

    @Override
    public IResult combineResult(IResult resultToCombine) {
        if(resultToCombine.isInfinityResult()){
            return resultToCombine;
        }else {
            addResult(resultToCombine);
            return this;
        }
    }

    @Override
    public void addToResult(Double resultsToAdd) {
        this.results.add(resultsToAdd);
    }

    @Override
    public ArrayList<Double> getResult() {
        return this.results;
    }

    @Override
    public boolean isInfinityResult() {
        return false;
    }


    public Result_n(Result_n other){
        this.results = new ArrayList<>(other.results);
    }
    @Override
    public IResult clone() {
        return new Result_n(this);
    }
}
