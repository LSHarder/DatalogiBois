package com.company;

public class Rect extends Shape {
    float height;
    float width;

    public Rect(){
        this.height = this.size;
        this.height = this.size;
    }

    public boolean overlapPoint(float x, float y){
        return x <= this.x + this.width && x >= this.x && y <= this.y + this.height && y >= this.y;
    }

    public double area () {return (double)(this.height * this.width);}

    public double circumference(){return(double)(this*height * 2.0F * this.width * 2.0F);}
}

