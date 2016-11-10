package com.company;

/**
 * Created by student3 on 10.11.16.
 */
public class Vector {
    int x, y;
    Ratio l;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
        l = new Ratio(x*x + y*y, 1);
    }

    static int multiply(Vector a, Vector b)
    {
        return a.x*b.x + b.y*a.y;
    }
    static Vector sum(Vector a, Vector b){return new Vector(a.x+b.x, a.y+b.y);}
}
