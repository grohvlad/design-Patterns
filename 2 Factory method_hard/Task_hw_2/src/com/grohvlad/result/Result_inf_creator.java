package com.grohvlad.result;

public class Result_inf_creator implements ICreateResult{

    @Override
    public IResult createResult() {
        return new Result_inf();
    }
}
