package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle c = new Circle();
	    c.set(2,3,5);
	    System.out.println(c.returnCenter());
	    System.out.println(c.area());
	    System.out.println(c.circumference());
	    System.out.println(c.overlapPoint(1,2));
    }
}

