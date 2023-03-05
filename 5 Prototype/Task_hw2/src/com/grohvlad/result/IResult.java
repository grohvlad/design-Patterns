package com.grohvlad.result;

import java.util.ArrayList;

public interface IResult {
    IResult combineResult(IResult resultToCombine);
    void addToResult(Double resultsToAdd);
    ArrayList<Double> getResult();
    boolean isInfinityResult();
    IResult clone();
}
