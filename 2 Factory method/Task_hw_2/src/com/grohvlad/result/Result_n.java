package com.grohvlad.result;

import java.util.ArrayList;

public class Result_n implements IResult{
    ArrayList<Double> results;
    public Result_n(){
        this.results = new ArrayList<>();
    }

    private void addResult(IResult resultToAdd) {
        this.results.addAll(resultToAdd.getResult());
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
}
