package com.grohvlad.sizes;

public class Large extends Size {
    public Large(){
        this.size = Sizes.Large;
        System.out.println("Size set to " + this.size.name() + "...");
    }
}
