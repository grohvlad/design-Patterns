package com.grohvlad.equation;

import com.grohvlad.result.IResult;
import com.grohvlad.result.Result_n;

public class BiQuadraticEquation extends Equation implements IEquation{
    private int a;
    public BiQuadraticEquation(int a, int b, int c) {
        super(b, c);
        this.a = a;
    }

    @Override
    public IResult solve(){
        if(this.c == 0){
            IResult res = new Result_n();
            res.addToResult(0D);
            IResult recres = (new QuadraticEquation(a,0,b)).solve();
            res = res.combineResult(recres);
            return res;
        }else {
            if(this.a == 0){
                IResult res = new Result_n();
                IResult recres = (new Equation(b,c)).solve();
                for(double powRes: recres.getResult()){
                    if(powRes>0){
                        res.addToResult(Math.sqrt(powRes));
                        res.addToResult(-Math.sqrt(powRes));
                    }
                }
                return res;
            }else{
                IResult res = new Result_n();
                IResult recres = (new QuadraticEquation (a,b,c)).solve();
                for(double powRes: recres.getResult()){
                    if(powRes>0){
                        res.addToResult(Math.sqrt(powRes));
                        res.addToResult(-Math.sqrt(powRes));
                    }
                }
                return res;
            }
        }
    }
    public String giveCondition(){
        return a + " 0 " + b + " 0 " + c;
    }

    public void change_a(int new_a){
        this.a = new_a;
    }

    public BiQuadraticEquation(BiQuadraticEquation that){
        super(that.b, that.c);
        this.a= that.a;
    }
    @Override
    public IEquation clone(){
        return new BiQuadraticEquation(this);
    }
}
