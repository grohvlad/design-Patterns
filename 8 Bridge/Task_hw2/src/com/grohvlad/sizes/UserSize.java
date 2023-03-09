package com.grohvlad.sizes;

public class UserSize extends Size{
    public UserSize() {
        this.size = Sizes.UserSize;
        System.out.println("Size set to " + this.size.name() + "...");
    }
}
