package com.practicas.cap6;

public class Ejercicio5 {
    public static void main(String[] args) {
        // la edad en años de los Dinosaurio
        int[] edades = {
                12, 5, 20, 8, 15, 3, 18, 10, 11, 21
        };

        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }

        double promedio = (double) sumaEdades / edades.length;

        System.out.println("=======Edad promedio de los dinosaurios======");
        System.out.println("Edades: " + java.util.Arrays.toString(edades));
        System.out.println("Cantidad: " + edades.length);
        System.out.println("Promedio: " + promedio);
    }
}
