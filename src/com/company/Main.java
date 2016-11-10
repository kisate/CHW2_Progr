package com.company;


import java.util.Scanner;

public class Main {

    static int input[] = new int[11];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 11; i++)
            input[i] = sc.nextInt();

    }

    String task1 () {

        Vector ab = new Vector(input[0], input[1]),
               bc = new Vector(input[1], input[2]),
               ac = new Vector(input[0], input[2]);

        Vector max = ab, side1 = bc, side2 = ac;

        if(bc.l > max.l) {max = bc; side1 = ab;}
        if(ac.l > max.l) {max = ac; side2 = ab;}

        if(max.l*max.l == side1.l*side1.l + side2.l*side2.l) return "Right";
        if(Vector.multiply(side1, side2) > 0) return "Thin";
        if(Vector.multiply(side1, side2) < 0) return "Thick";
        return "Common";
    }

    String task23 ()
    {
        Vector ab = new Vector(input[0], input[1]),
                bc = new Vector(input[1], input[2]),
                ac = new Vector(input[0], input[2]);

        Vector max = ab, side1 = bc, side2 = ac;

        if(bc.l > max.l) {max = bc; side1 = ab;}
        if(ac.l > max.l) {max = ac; side2 = ab;}

        double sin = Math.sqrt(1 - Math.sqrt(1 - Math.pow(Vector.multiply(side1, side2)/(side1.l*side2.l), 2)));

        return "" + Vector.multiply(side1, side2) + "/" + side1.l*side2.l + "\n" + 0.5*side1.l*side2.l*sin;
    }

    String task4 ()
    {

    }
}
