package com.practicas.cap6;

public class Practica1 {
    public static void main(String[] args) {
        double[] result = { 1.0, 2.0, 6.2, 2.3 };
        double total = 0;

        for (int i = 0; i < result.length; i++) {
            total += result[i];
        }
        double average = total / result.length;
        System.out.println(average);
    }
}
