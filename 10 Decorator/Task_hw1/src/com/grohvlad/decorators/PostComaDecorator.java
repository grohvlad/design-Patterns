package com.grohvlad.decorators;

import com.grohvlad.component.Component;

public class PostComaDecorator extends BaseDecorator{

    public PostComaDecorator(Component wrapper) {
        super(wrapper);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(",");
    }
}
