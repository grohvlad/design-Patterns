package com.grohvlad.sizes;

public abstract class Size {
    public enum Sizes{ Small, Medium, Large}
    protected Sizes size;
    public Sizes getSize(){
        return this.size;
    }
}
