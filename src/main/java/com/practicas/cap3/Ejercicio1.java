package com.practicas.cap3;

public class Ejercicio1 {
    public static void main(String[] args) {
        // peso en kilogramos
        // peso del dinosaurio 1 Trex
        double peso1 = 1500.0;
        // peso del dinosaurio 2 triceratops
        double peso2 = 8000.0;

        // el peso promedio se calcula sumando el p1 + p2 dividiendo entre dos
        double pesoPromedio = (peso1 + peso2) / 2;

        System.out.println("Peso del dinosaurio TRex: " + peso1 + " Kg.");
        System.out.println("Peso del dinosaurio Triceratops: " + peso2 + " Kg.");
        System.out.println("Peso Promedio: " + pesoPromedio + " Kg.");

    }
}
