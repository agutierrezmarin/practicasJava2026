package com.practicas.cap7;

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(3.2, 3.1));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
