package com.grohvlad.equation;

import com.grohvlad.Main;
import com.grohvlad.result.IResult;

public class QuadraticEquation extends Equation implements IEquation{
    private int a;
    private IResult result;
    public QuadraticEquation(int a, int b, int c) {
        super(b,c);
        this.a = a;
        this.result = solve();
    }

    @Override
    public IResult solve(){
        if(this.a == 0){
            return Main.getEquationTypeSolver("eq").createEquation(0,b,c).solve();
        } else{
            if(this.b == 0){
                if(this.c == 0){
                    IResult res = Main.getEmptyResult("n").createResult();
                    res.addToResult(0D);
                    return res;
                } else if(this.a*this.c>0){
                    IResult res = Main.getEmptyResult("n").createResult();
                    return res;
                } else {
                    IResult res = Main.getEmptyResult("n").createResult();
                    double dres = Math.sqrt((double) this.c/this.a);
                    res.addToResult(dres);
                    res.addToResult(-dres);
                    return res;
                }

            }else{
                if(this.c == 0){
                    IResult res = Main.getEmptyResult("n").createResult();
                    res.addToResult(0D);
                    IResult recres = Main.getEquationTypeSolver("eq").createEquation(0,a,b).solve();
                    res = res.combineResult(recres);
                    return res;
                }else {
                    double D = this.b*this.b - 4*this.a*this.c;
                    if(D < 0){
                        return Main.getEmptyResult("n").createResult();
                    } else if(Math.abs(D) < 2 * Double.MIN_VALUE){ //D == 0
                        IResult res = Main.getEmptyResult("n").createResult();
                        double dres = (double) (-this.b)/(2*this.a);
                        res.addToResult(dres);
                        return res;
                    } else {
                        IResult res = Main.getEmptyResult("n").createResult();
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
}
