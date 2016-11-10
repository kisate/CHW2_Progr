package com.company;

/**
 * Created by Dima on 10.11.2016.
 */
public class Ratio {
    int m, n, irm, irn;

    public Ratio(int irm, int irn) {
        int n = 1, m =1;
        if (irn > 1) {irm*=irn; n*=irn; irn = 1;}

        for (int i = 2; i*i <= irm; i++) if(irm % (i*i) == 0) {m*= i; irm/= i*i;i--;}

        int gcd = GCD(n,m);
        if (gcd > 1) {n/= gcd; m/= gcd;}

        this.m = m;
        this.n = n;
        this.irn = irn;
        this.irm = irm;

    }

    public Ratio(int m, int n, int irm, int irn) {
        if (irn > 1) {irm*=irn; n*=irn; irn = 1;}

        for (int i = 2; i*i <= irm; i++) if(irm % (i*i) == 0) {m*= i; irm/= i*i;i--;}

        int gcd = GCD(n,m);
        if (gcd > 1) {n/= gcd; m/= gcd;}

        this.n = n;
        this.m = m;
        this.irn = irn;
        this.irm = irm;
    }

    static int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }

    static Ratio sum(Ratio a, Ratio b)
    {
        return new Ratio(a.m*b.n + b.m*a.n, a.n*b.n, 1, 1);
    }

    static Ratio ded(Ratio a, Ratio b)
    {
        return sum(a, new Ratio(-b.m, b.n, 1, 1));
    }

    static Ratio mult(Ratio a, Ratio b)
    {
        return new Ratio(a.m*b.m, a.n*b.n, 1, 1);
    }

    static Ratio div(Ratio a, Ratio b)
    {
        return new Ratio(a.m*b.n, a.n*b.m, 1, 1);
    }

    static boolean isBigger(Ratio a, Ratio b) {
        if (Math.signum(a.m)*(a.m*a.m + a.irm)*b.n > Math.signum(b.m)*(b.m*b.m + b.irm)*a.n) return true;
        else return false;
    }
    static boolean eguals(Ratio a, Ratio b) {
        if (Math.signum(a.m)*(a.m*a.m + a.irm)*b.n == Math.signum(b.m)*(b.m*b.m + b.irm)*a.n) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "(" + this.m + "sqrt(" + this.irm + ")) / (" + this.n + ")";
    }
}
