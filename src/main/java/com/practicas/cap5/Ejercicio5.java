package com.practicas.cap5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketsDisponibles = 10;
        int ticketsVendidos = 5;

        System.out.println("=====taquilla de parque jurasico======");
        System.out.println("Tickets disponibles " + ticketsDisponibles);
        System.out.println();
        while (ticketsDisponibles > 0) {
            System.out.println("¿Cuantos tickets desea comprar? (disponibles: " + ticketsDisponibles + "):");
            int solicitados = sc.nextInt();
            if (solicitados <= 0) {
                System.out.println("Cantidad invalida, ingrese un numero positivo");
            } else if (solicitados > ticketsDisponibles) {
                System.out.println("No hay suficientes tickets, solo quedan : " + ticketsDisponibles + " .");
            } else {
                ticketsDisponibles -= solicitados;
                ticketsVendidos += solicitados;
                System.out.println(solicitados + " tickets vendidos; " + "Quedan: " + ticketsDisponibles);
            }
            System.out.println();
        }
        System.out.println("tickets agotados; total vendidos: " + ticketsVendidos);
    }
}
