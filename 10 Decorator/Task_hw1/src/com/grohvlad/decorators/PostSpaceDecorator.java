package com.grohvlad.decorators;

import com.grohvlad.component.Component;

public class PostSpaceDecorator extends BaseDecorator{
    public PostSpaceDecorator(Component wrapper) {
        super(wrapper);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(" ");
    }
}
