package com.grohvlad.equation;

import com.grohvlad.result.IResult;

public interface IEquation {
    IResult solve();
    IResult giveResult();
    int[] giveCondition();
}
