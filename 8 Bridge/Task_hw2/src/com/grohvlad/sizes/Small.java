package com.grohvlad.sizes;

public class Small extends Size{
    public Small(){
        this.size = Sizes.Small;
        System.out.println("Size set to " + this.size.name() + "...");
    }
}
