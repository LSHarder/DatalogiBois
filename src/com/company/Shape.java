package com.company;

public abstract class Shape {
    float y;
    float x;

    public String returnCenter() {
        return this.x + ", " + this.y;
    }
}
