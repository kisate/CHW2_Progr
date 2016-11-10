package com.company;

/**
 * Created by student3 on 10.11.16.
 */
public class Vector {
    int x, y;
    double l;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
        l = Math.sqrt(x*x + y*y);
    }

    static int multiply(Vector a, Vector b)
    {
        return a.x*b.x + b.y*a.y;
    }
}
