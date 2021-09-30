package com.company;

import java.lang.Math;

public class Triangle extends Shape {
    float height;
    float width;

    public void set(float h, float w, float x, float y) {
        this.width = w;
        this.height = h;
        this.x = x;
        this.y = y;
    }

    public double area() {
        return (this.height * this.width) / 2;
    }

    public double circumference() {
        return Math.sqrt(Math.pow((this.width / 2), 2) + Math.pow(this.height, 2)) * 2 + this.width;
    }

    public boolean overlapPoint(float x, float y) {
        float x1 = this.x;
        float y1 = this.y;
        float x2 = this.x + this.width;
        float y2 = this.y;
        float x3 = this.x;
        float y3 = this.y + this.height;

        float a1 = (x1*(y2 - y) + x2*(y - y1) + x*(y1 - y2)) / 2;
        float a2 = (x1*(y - y3) + x*(y3 - y1) + x3*(y1 - y)) / 2;
        float a3 = (x*(y2 - y3) + x2*(y3 - y) + x3 * (y - y2)) / 2;


        return this.area() == a1 + a2 + a3 && a1 >= 0 && a2 >= 0 && a3 >= 0;

    }


}


