package com.company;

/**
 * Created by Dima on 12.11.2016.
 */
public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static public boolean equals(Point a, Point b){
        if ((a.x == b.x) &&(a.y == b.y)) return true;
        return false;
    }
}
