package com.practicas.cap5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hambriento;
        int porcionesServidas = 0;
        System.out.println("======Sistema de alimnetacion para Trex=======");
        do {
            porcionesServidas++;
            System.out.println("Porcion #" + porcionesServidas + " servido 40 kgs. de carne.");
            System.out.println("¿El dino sigue con hambre (S/N)?");
            hambriento = sc.nextLine().trim().toUpperCase();

        } while (hambriento.equals("S"));

        System.out.println("El dinosaurio esta satisfecho con: " + porcionesServidas + " porciones; consumiento: "
                + (porcionesServidas * 40) + " Kg.");
    }
}
