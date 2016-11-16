package com.company;

/**
 * Created by student3 on 10.11.16.
 */
public class Vector {

    double x, y;
    Point  begin, end;
    double l;


    public Vector() {
        x = 0;
        y = 0;
        l = 0;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        end = new Point(0, 0);
        begin = new Point(0, 0);
        l = Math.sqrt(x*x + y*y);
    }

    public Vector(Point begin, Point end) {
        this.begin = begin;
        this.end = end;

        x = end.x - begin.x;
        y = end.y - begin.y;

        l = Math.sqrt(x*x + y*y);
    }

    public Vector(double x, double y, Point begin, Point end) {
        this.x = x;
        this.y = y;
        this.begin = begin;
        this.end = end;
        l = Math.sqrt(x*x + y*y);
    }

    static double multiply(Vector a, Vector b)
    {
        return a.x*b.x + b.y*a.y;
    }

    static Vector multiply(Vector a, double b){
        return new Vector(a.x * b, a.y * b, new Point(a.begin.x*b, a.begin.y*b), new Point(a.end.x*b, a.end.y*b));
    }

    static Vector sum(Vector a, Vector b){
        return new Vector(a.x+b.x, a.y+b.y);
    }

    static Vector ded(Vector a, Vector b){
        return new Vector(a.x - b.x, a.y - b.y);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", l=" + l +
                '}';
    }
}
