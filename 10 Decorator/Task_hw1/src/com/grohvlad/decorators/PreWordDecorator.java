
package com.grohvlad.decorators;

import com.grohvlad.component.Component;

public class PreWordDecorator extends BaseDecorator{
    private final String word;
    public PreWordDecorator(Component wrapper, String word) {
        super(wrapper);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.printf(word);
        super.print();
    }
}