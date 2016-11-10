package com.company;


import java.util.Scanner;

public class Main {

    static int input[] = new int[6];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       for (int i = 0; i < 6; i++)
            input[i] = sc.nextInt();

        System.out.println(task1() + "\n" + task23());
    }

    static String task1 () {

        Vector ab = new Vector(input[2] - input[0], input[3] - input[1]),
               bc = new Vector(input[4] - input[2], input[5] - input[3]),
               ac = new Vector(input[4] - input[0], input[5] - input[1]);

        Vector max = ab, side1 = bc, side2 = ac;

        if(Ratio.isBigger(bc.l, max.l)) {max = bc; side1 = ab;}
        if(Ratio.isBigger(ac.l, max.l)) {max = ac; side2 = ab;}

        if(Ratio.eguals(Ratio.mult(max.l, max.l), Ratio.sum(Ratio.mult(side1.l, side1.l), Ratio.mult(side2.l, side2.l)))) return "Right";
        if(Vector.multiply(side1, side2) > 0) return "Thin";
        if(Vector.multiply(side1, side2) < 0) return "Thick";
        return "Common";
    }

    static String task23 ()
    {
        Vector ab = new Vector(input[2] - input[0], input[3] - input[1]),
               bc = new Vector(input[4] - input[2], input[5] - input[3]),
               ac = new Vector(input[4] - input[0], input[5] - input[1]);

        Vector max = ab, side1 = bc, side2 = ac;

        if(Ratio.isBigger(bc.l, max.l)) {max = bc; side1 = ab;}
        if(Ratio.isBigger(ac.l, max.l)) {max = ac; side2 = ab;}

        Ratio sin2 = Ratio.ded(new Ratio(1,1,1,1),
                Ratio.mult(Ratio.div(new Ratio(Vector.multiply(side1, side2), 1, 1, 1), (Ratio.mult(side1.l,side2.l))),
                        Ratio.div(new Ratio(Vector.multiply(side1, side2), 1, 1, 1), (Ratio.mult(side1.l,side2.l)))));
        Ratio sin = new Ratio(sin2.n, sin2.m);

        Ratio cos = Ratio.div(new Ratio(Vector.multiply(side1, side2), 1, 1, 1), (Ratio.mult(side1.l,side2.l)));

        Ratio sqr = Ratio.mult(Ratio.mult(new Ratio(1, 2, 1, 1), sin), Ratio.mult(side1.l, side2.l));
        return cos + "\n" + sqr;
    }

    static String task4 ()
    {
        return null;
    }
}
