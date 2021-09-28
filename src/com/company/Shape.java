package com.company;

public abstract class Shape {
    float y;
    float x;

    public String returnCenter() {
        return this.x + ", " + this.y;
    }
    public double dist (double x, double y){
        return Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2));
    }
}
