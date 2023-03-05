package com.grohvlad.equation;

import com.grohvlad.result.IResult;
import com.grohvlad.result.Result_inf;
import com.grohvlad.result.Result_n;

public class QuadraticEquation extends Equation implements IEquation {
    private int a;
    public QuadraticEquation(int a, int b, int c) {
        super(b,c);
        this.a = a;
    }

    @Override
    public IResult solve(){

        if(this.a == 0){
            return (new Equation(b,c)).solve();
        } else{
            if(this.b == 0){
                if(this.c == 0){
                    IResult res = emptyResult.clone();
                    res.addToResult(0D);
                    return res;
                } else if(this.a*this.c>0){
                    IResult res = emptyResult.clone();
                    return res;
                } else {
                    IResult res = emptyResult.clone();
                    double dres = Math.sqrt((double) -this.c/this.a);
                    res.addToResult(dres);
                    res.addToResult(-dres);
                    return res;
                }

            }else{
                if(this.c == 0){
                    IResult res = emptyResult.clone();
                    res.addToResult(0D);
                    IResult recres = (new Equation(a,b)).solve();
                    res = res.combineResult(recres);
                    return res;
                }else {
                    double D = this.b*this.b - 4*this.a*this.c;
                    if(D < 0){
                        return emptyResult.clone();
                    } else if(Math.abs(D) < 2 * Double.MIN_VALUE){ //D == 0
                        IResult res = emptyResult.clone();
                        double dres = (double) (-this.b)/(2*this.a);
                        res.addToResult(dres);
                        return res;
                    } else {
                        IResult res = emptyResult.clone();
                        double dres1 = (double) (-this.b + Math.sqrt(D))/(2*this.a);
                        res.addToResult(dres1);
                        double dres2 = (double) -(this.b+ Math.sqrt(D))/(2*this.a);
                        res.addToResult(dres2);
                        return res;
                    }
                }
            }
        }
    }

    public String giveCondition(){
        return "0 0 " + a + " " + b +" " + c;
    }

    public void change_a(int new_a){
        this.a = new_a;
    }

    public QuadraticEquation(QuadraticEquation that){
        super(that.b,that.c);
        this.a = that.a;
    }
    @Override
    public IEquation clone() {
        return new QuadraticEquation(this);
    }
}
