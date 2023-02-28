package com.grohvlad.result;

import java.util.ArrayList;

public class Result_inf implements IResult{
    ArrayList<Double> results = new ArrayList<>();

    @Override
    public IResult combineResult(IResult resultToCombine) {
        return this;
    }

    @Override
    public void addToResult(Double resultsToAdd) {
        //It already has all possible values;
    }

    @Override
    public ArrayList<Double> getResult() {
        return results;
    }

    @Override
    public boolean isInfinityResult() {
        return true;
    }
}
