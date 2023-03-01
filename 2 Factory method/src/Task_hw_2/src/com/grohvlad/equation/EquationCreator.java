package com.grohvlad.equation;

public class EquationCreator implements IEquationCreator{

    @Override
    public IEquation createEquation(int a, int b, int c) {
        return new Equation(b,c);
    }
}
