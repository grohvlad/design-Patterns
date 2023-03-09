package com.grohvlad.buttons;

import com.grohvlad.sizes.Size;

public abstract class Button {
    public enum Types{ Checkbox, Dropdown, Radio}

    protected Types type;
    protected Size size;
    public void draw(){
        System.out.println( "Drawing a " + size.getSize().name() + " " + this.type.name() + " button.");
    }

}
