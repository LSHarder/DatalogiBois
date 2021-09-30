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
		Triangle t = new Triangle();
		t.set(4,6,10,20 );
		System.out.println(t.returnCenter());
		System.out.println(t.area());
		System.out.println(t.circumference());
		System.out.println(t.overlapPoint(1,2));

    }
}

