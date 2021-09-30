package com.company;

public class Rect extends Shape {
    float height;
    float width;
    float size;

    public void set(float x, float y, float size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.height = size;
        this.width = size;
    }

    public boolean overlapPoint(float x, float y) {
        return x <= this.x + this.width && x >= this.x && y <= this.y + this.height && y >= this.y;
    }

    public double area() {
        return (this.height * this.width);
    }

    public double circumference() {
        return (this.height * 2) + (this.width * 2);
    }
}

