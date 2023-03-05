package com.grohvlad.equation;

import com.grohvlad.result.*;

import java.util.ArrayList;

public class Equation implements IEquation{

    protected IResult emptyResult = new Result_n();
    protected IResult infResult = new Result_inf();
    protected int b;
    protected int c;
    public Equation(int b, int c){
        this.b = b;
        this.c = c;
    }
    @Override
    public IResult solve(){
        if(this.b == 0 && this.c == 0){
            return infResult.clone();
        }else if (this.b == 0){
            return emptyResult.clone();
        } else {
            IResult res = emptyResult.clone();
            double result = (double) -this.c / this.b;
            res.addToResult(result);
            return res;
        }
    }
    @Override
    public String giveCondition(){
        return "0 0 0 " + b + " " + c;
    }

    public void change_c(int new_c){
        this.c = new_c;
    }
    public void change_b(int new_b){
        this.b = new_b;
    }


    public Equation(Equation that){
        this.b = that.b;
        this.c = that.c;
        this.emptyResult = that.emptyResult;
        this.infResult = that.infResult;
    }
    @Override
    public IEquation clone() {
        return new Equation(this);
    }

    @Override
    public void change_a(int new_c){}
}
