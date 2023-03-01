package com.grohvlad.equation;

public class BiQuadraticEquationCreator implements IEquationCreator{
    @Override
    public IEquation createEquation(int a, int b, int c) {
        return new BiQuadraticEquation(a, b, c);
    }
}
