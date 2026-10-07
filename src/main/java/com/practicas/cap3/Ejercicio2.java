package com.practicas.cap3;

public class Ejercicio2 {

    public static void main(String[] args) {
        double pesoDino = 2000.0; // peso en Kg
        double proporcionDiario = 0.05; // 5% del peso corporal
        // se multiplica el peso por pa proporcion diariaç
        double alimentoDiario = pesoDino * proporcionDiario;
        System.out.println("Peso dinosaruio :" + pesoDino + " Kg.");
        System.out.println("Proporcion diario :" + (proporcionDiario * 100) + " %");
        System.out.println("Alimento requerido por dia:" + alimentoDiario + " Kg.");
    }
}
