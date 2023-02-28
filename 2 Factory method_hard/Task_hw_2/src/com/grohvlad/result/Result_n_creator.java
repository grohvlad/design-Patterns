package com.grohvlad.result;

public class Result_n_creator implements ICreateResult{
    @Override
    public IResult createResult() {
        return new Result_n();
    }
}
