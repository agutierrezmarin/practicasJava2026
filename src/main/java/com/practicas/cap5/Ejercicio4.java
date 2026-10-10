package com.practicas.cap5;

public class Ejercicio4 {
    public static void main(String[] args) {
        // pesos de dinosaurios en el recinto
        // usamos valores fijos por el momento
        int cantidadDinos = 5;
        int pesoTotal = 0;
        // pesos simulados con una expresion
        int peso;
        for (int i = 1; i <= cantidadDinos; i++) {
            if (i == 1) {
                peso = 800;
            } else if (i == 2) {
                peso = 1200;
            } else if (i == 3) {
                peso = 950;
            } else if (i == 4) {
                peso = 700;
            } else {
                peso = 1100;
            }
            System.out.println("Dinosaurio #:" + i + " (Recinto B):" + peso + " Kg.");
            pesoTotal += peso;
        }
        System.out.println("-------------------------");
        System.out.println("Peso total en recinto B:" + pesoTotal + " Kg.");
        System.out.println("Promedio por dinosaurio:" + (pesoTotal / cantidadDinos) + " Kg.");
    }
}
