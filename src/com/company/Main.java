package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle c = new Circle();
	    c.set(2,3,5);
	    System.out.println(c.returnCenter());
	    System.out.println(c.area());
	    System.out.println(c.circumference());
	    System.out.println(c.overlapPoint(1,2));
		Rect r = new Rect();
		r.set(4,6,10);
		System.out.println(r.returnCenter());
		System.out.println(r.area());
		System.out.println(r.circumference());
		System.out.println(r.overlapPoint(1,2));
    }
}

