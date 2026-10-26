package com.practicas.cap6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practica4 {
    public static void main(String[] args) {
        // redimensiona arrays con copyOf

        int[] originalArray = { 10, 20, 30, 40, 50 };
        int newLength = 7;
        int[] resizedArray = Arrays.copyOf(originalArray, newLength);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Original array: " + Arrays.toString(resizedArray));

        // coparara dos arrays
        int[] resultado1 = { 10, 20, 30, 40, 50 };
        int[] resultado2 = { 10, 20, 30, 40, 50 };
        boolean arrayEqual = Arrays.equals(resultado1, resultado2);
        System.out.println("Son iguales los vectores?:" + arrayEqual);
    }
}
