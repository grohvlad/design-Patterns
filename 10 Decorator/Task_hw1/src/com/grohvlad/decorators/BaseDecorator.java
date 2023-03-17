package com.grohvlad.decorators;

import com.grohvlad.component.Component;

public class BaseDecorator implements Component {
    protected Component wrapper;
    public BaseDecorator(Component wrapper){
        this.wrapper = wrapper;
    }
    @Override
    public void print() {
        wrapper.print();
    }
}
