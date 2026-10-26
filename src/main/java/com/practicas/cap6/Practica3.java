package com.practicas.cap6;

import java.util.Arrays;

public class Practica3 {
    public static void main(String[] args) {
        // llena un array con un valor especifico
        int[] results = new int[5];
        Arrays.fill(results, 45);
        System.out.println(Arrays.toString(results));

        // crear una copia de una array/
        int[] results2 = { 10, 20, 30, 40, 50, 60 };
        // int[] copiaResult2 = Arrays.copyOf(results2, results2.length);
        // System.out.println(Arrays.toString(copiaResult2));
        // verifcar que estan los datos copiados modificando un elemento de la copia
        // copiaResult2[0] = 1000;
        // System.out.println(Arrays.toString(copiaResult2));
        // System.out.println(Arrays.toString(results2));

        int[] copiedResult = results2;

        copiedResult[0] = 1000;

        System.out.println(Arrays.toString(copiedResult));
        System.out.println(Arrays.toString(results2));

    }
}
