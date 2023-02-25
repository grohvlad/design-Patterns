package com.grohvlad.equation;

import com.grohvlad.result.IResult;
import com.grohvlad.Main;

public class Equation implements IEquation{
    protected int a;
    protected int b;
    protected int c;
    protected IResult result;
    protected int[] condition;
    public Equation(int b, int c){
        this.b = b;
        this.c = c;
        this.result = solve();
        this.condition = new int[]{b,c};
    }
    @Override
    public IResult solve(){
        if(this.b == 0 && this.c == 0){
            return Main.getEmptyResult("inf").createResult();
        }else if (this.b == 0){
            return Main.getEmptyResult("n").createResult();
        } else {
            IResult res = Main.getEmptyResult("n").createResult();
            double result = (double) -this.c / this.b;
            res.addToResult(result);
            return res;
        }
    }
    @Override
    public IResult giveResult(){return result;}
    @Override
    public int[] giveCondition(){return condition;}
}
