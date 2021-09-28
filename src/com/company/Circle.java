package com.company;
import java.lang.Math;
public class Circle extends Shape {
    float radius;
    public void set(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean overlapPoint(float x, float y){
        return this.dist(x,y) <= this.radius;
    }

    public double area(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    public double circumference(){
        return  Math.PI*2*this.radius;
    }
}
