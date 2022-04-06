package com.company;

public class Second {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double S, P;
        S = 0.5*a*b;
        P = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))+a+b;
        System.out.println("Площа: " + S);
        System.out.println("Периметр: " + P);
    }
}
