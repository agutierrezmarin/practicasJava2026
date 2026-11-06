package com.practicas.cap7;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // crear un solo scanner para todo el programa
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("====Primer numero=====");
            int num1 = readAndValidate(sc);
        }

    }

    private static int readAndValidate(Scanner sc) {
        int number;
        while (true) {
            System.out.println("Ingrese un numero entre 1 y 100");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number >= 10 || number <= 100) {
                    return number; // si el numero cumple con la condicion lo devuelve
                } else {
                    System.out.println("Numero fuera de rango. Intente nuevamente");
                }
            } else {
                System.out.println("Entrada invalida, debe ingresar un numero entero");
                sc.nextInt();
                // limpia el resultado y evita bucle infinito
            }
        }
    }
}
