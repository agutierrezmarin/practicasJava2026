package com.practicas.cap6;

import java.util.Arrays;

public class Practica2 {
    public static void main(String[] args) {
        int[] result = { 30, 10, 50, 20, 40 };
        String arrayAsString = Arrays.toString(result);
        System.out.println("Array: " + arrayAsString);
        System.out.println("Los datos ordernador");
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        // busqueda binaria
        // el array debe estar ordenado para la busqueda
        int target = 40; // es el elemento ue se busca
        int index = Arrays.binarySearch(result, target);
        System.out.println("Index of: " + target + ":" + index);

    }
}
