package com.company;


import java.util.Scanner;

public class Main {

    static int input[] = new int[11];
    static Point A, B, C, D, K, Z, M;
    static Vector AB, BC, CD, DA, BD, BM, CK, AC;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 11; i++)
            input[i] = sc.nextInt();

        A = new Point(input[0], input[1]);
        B = new Point(input[2], input[3]);
        C = new Point(input[4], input[5]);
        D = new Point(input[6], input[7]);
        AB = new Vector(A, B);
        BC = new Vector(B, C);
        AC = new Vector(A, C);
        CK = Vector.multiply(AB, input[8]);
        BD = new Vector(B, D);
        BM = Vector.multiply(BD, input[9]/ input[10]);

        System.out.println(Vector.multiply(AB, BC));

        task1();
        task23();

    }

    static void task1 () {

        Vector max = AB, side1 = BC, side2 = AC;

        if(BC.l > max.l) {side1 = max; max = BC;}
        if(AC.l > max.l) {side2 = max; max = AC;}

        if(!Point.equals(side1.begin, side2.begin)) side2 = Vector.multiply(side2, -1);

        System.out.printf(side1 + "\n" + side2 + "\n" + max);

        String output = "";

        if(max.x*max.x +  max.y*max.y == side1.x*side1.x + side1.y*side1.y + side2.x*side2.x + side2.y*side2.y) output =  "Right";
        if(Vector.multiply(side1, side2) > 0) output = "Thin";
        if(Vector.multiply(side1, side2) < 0) output = "Thick";

        System.out.println(output + "\n");
    }

    static void task23 ()
    {
        Vector max = AB, side1 = BC, side2 = AC;

        if(BC.l > max.l) {side1 = max; max = BC;}
        if(AC.l > max.l) {side2 = max; max = AC;}

        if(!Point.equals(side1.begin, side2.begin)) side2 = Vector.multiply(side2, -1);

        double sin = Math.sqrt(1 - Math.pow(Vector.multiply(side1, side2)/(side1.l*side2.l), 2));

        System.out.println( "" + Vector.multiply(side1, side2) / side1.l*side2.l + "\n" + 0.5*side1.l*side2.l*sin + "\n");
    }

    String task4 ()
    {
        K = new Point(C.x + CK.x, C.y + CK.y);
        Vector OZ = Vector.sum();
        return "";
    }
}
