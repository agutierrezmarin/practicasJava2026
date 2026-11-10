package com.practicas.cap7;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] ages = { 3, 7, 12, 5, 20 };
        System.out.printf("Edad promedio : %.1f años %n", average(ages));
    }

    private static double average(int[] ages) {

        if (ages == null || ages.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}
