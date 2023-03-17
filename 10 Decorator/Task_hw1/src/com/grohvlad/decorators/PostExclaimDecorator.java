package com.grohvlad.decorators;

import com.grohvlad.component.Component;

public class PostExclaimDecorator extends BaseDecorator{

    public PostExclaimDecorator(Component wrapper) {
        super(wrapper);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("!");
    }
}