package com.grohvlad.equation;

public class QuadraticEquationCreator implements IEquationCreator{

    @Override
    public IEquation createEquation(int a, int b, int c) {
        return new QuadraticEquation(a,b,c);
    }
}
