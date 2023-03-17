package com.grohvlad.decorators;

import com.grohvlad.component.Component;

public class PostWordDecorator extends BaseDecorator{
    private final String word;
    public PostWordDecorator(Component wrapper, String word) {
        super(wrapper);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(word);
    }
}