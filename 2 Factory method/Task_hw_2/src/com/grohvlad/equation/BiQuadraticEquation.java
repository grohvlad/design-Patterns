package com.grohvlad.equation;

import com.grohvlad.Main;
import com.grohvlad.result.IResult;

public class BiQuadraticEquation extends Equation implements IEquation{
    private int a;
    public BiQuadraticEquation(int a, int b, int c) {
        super(b, c);
        this.a = a;
        this.condition = new int[]{a,0,b,0,c};
    }

    @Override
    public IResult solve(){
        if(this.c == 0){
            IResult res = Main.getEmptyResult("n").createResult();
            res.addToResult(0D);
            IResult recres = Main.getEquationTypeSolver("quad").createEquation(a,0,b).solve();
            res = res.combineResult(recres);
            return res;
        }else {
            if(this.a == 0){
                IResult recres = Main.getEquationTypeSolver("eq").createEquation(0,b,c).solve();
                return recres;
            }else{
                IResult res = Main.getEmptyResult("n").createResult();
                IResult recres = Main.getEquationTypeSolver("quad").createEquation(a,b,c).solve();
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
}
