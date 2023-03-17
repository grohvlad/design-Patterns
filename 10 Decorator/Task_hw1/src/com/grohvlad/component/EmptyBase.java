package com.grohvlad.component;

import com.grohvlad.component.Component;

public class EmptyBase implements Component {
    private final String base;

    public EmptyBase() {
        this.base = "";
    }

    @Override
    public void print() {
        System.out.print(base);
    }
}