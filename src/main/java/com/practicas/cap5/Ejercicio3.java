package com.practicas.cap5;

public class Ejercicio3 {
    public static void main(String[] args) {
        // determina los minutos que falta para la apertura
        int minutosParaApertura = 10;
        System.out.println("Cuenta regresiva para apertura del parque");
        while (minutosParaApertura > 0) {
            System.out.println("Faltan: " + minutosParaApertura + " minuto(s) para la apertura...");
            minutosParaApertura--;

        }
        System.out.println("El parque esta abierto...");

    }
}
