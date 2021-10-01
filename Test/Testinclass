package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Testinclass{
    Circle c = new Circle();
    Rect r = new Rect();
    Triangle t = new Triangle();

    @BeforeEach
    void setUp() {
        c.set(1,1,1);
        r.set(1,1,1);
        t.set(1,1,1,1);
    }

    @Test
    @DisplayName("circumference should work")
    void testcircumference() {

        assertEquals(6.283185307179586, c.circumference(),
                "Circumference should work in circle");
        assertEquals(4.0, r.circumference(),
                "Circumference should work in rectangle");
        assertEquals(3.23606797749979, t.circumference(),
                "Circumference should work in triangle");
    }

    @Test
    @DisplayName("secure handling of overlapPoint")
    void testWithPointInAndOutOfOverlapPoint() {
        assertFalse(c.overlapPoint(0, 5), "handling of overlapPoint ok with c");
        assertTrue(c.overlapPoint(1, 1), "handling of overlapPoint ok with c");

        assertFalse(r.overlapPoint(0, 5), "handling of overlapPoint ok with r");
        assertTrue(r.overlapPoint(1, 1), "handling of overlapPoint ok with r");

        assertFalse(t.overlapPoint(0, 5), "handling of overlapPoint ok with t");
        assertTrue(t.overlapPoint(1, 1), "handling of overlapPoint ok with t");
    }
    @Test
    @DisplayName("test area")
    void testarea() {
        assertEquals(3.141592653589793, c.area(),
                "area should work in circle");
        assertEquals(1.0, r.area(),
                "area should work in rectangle");
        assertEquals(0.5, t.area(),
                "area should work in triangle");
    }
    @Test
    @DisplayName("test dist")
    void testdist() {
        assertEquals(1, c.dist(2,1),
                "dist should work in circle");
        assertEquals(1, r.dist(2,1),
                "dist should work in rectangle");
        assertEquals(1, t.dist(2,1),
                "dist should work in triangle");
    }
    @Test
    @DisplayName("test returnCenter")
    void testreturncenter() {
        assertEquals("1.0, 1.0", c.returnCenter(),
                "dist should work in circle");
        assertEquals("1.0, 1.0", r.returnCenter(),
                "dist should work in rectangle");
        assertEquals("1.0, 1.0", t.returnCenter(),
                "dist should work in triangle");

    }

}
