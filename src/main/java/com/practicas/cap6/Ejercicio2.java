package com.practicas.cap6;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] nombres = {
                "tyranosurus rex",
                "Velociraptor",
                "triceratops",
                "Brachiosaurios",
                "Stegosaurus"
        };
        double[] pesos = {
                8000.00,
                15,
                5000,
                56000,
                35000.0
        }; // peso en Kg.

        int indiceMasPesado = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > pesos[indiceMasPesado]) {
                indiceMasPesado = i;
            }

        }
        System.out.println("========Dinosaurio mas pesado=========");
        System.out.println("Nombre: " + nombres[indiceMasPesado]);
        System.out.println("Peso: " + pesos[indiceMasPesado] + " Kg.");
    }
}
