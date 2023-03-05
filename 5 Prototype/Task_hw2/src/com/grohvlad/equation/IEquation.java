package com.grohvlad.equation;

import com.grohvlad.result.IResult;

public interface IEquation {
    IResult solve();
    String giveCondition();
    IEquation clone();
    void change_a(int new_a);
    void change_b(int new_b);
    void change_c(int new_c);
}
