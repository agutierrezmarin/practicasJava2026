package com.practicas.cap5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cercaElectrica = false;
        boolean camarasSurveillance = false;
        boolean guardiaActivo = false;
        boolean sistemaAlarma = false;
        System.out.println("======Sistema de seguridad Paruqe jurasico======");
        do {
            // verifica cerca electrica
            if (!cercaElectrica) {
                System.out.println("¿Cerca electrica activa?(si/no)");
                cercaElectrica = sc.nextLine().trim().equalsIgnoreCase("SI");
                if (!cercaElectrica) {
                    System.out.println("[!] Cerca electrica requerida");
                }
            }
            // verfica camaras de vigilancia
            if (!camarasSurveillance) {
                System.out.println("¿Camaras de vigilancia activas?(si/no)");
                camarasSurveillance = sc.nextLine().trim().equalsIgnoreCase("si");
                if (!camarasSurveillance) {
                    System.out.println("[!] camaras requeridas.");
                }
            }
            // verfica guardia
            if (!guardiaActivo) {
                System.out.println("¿guardia de seguridad en su puesto?(si/no)");
                guardiaActivo = sc.nextLine().trim().equalsIgnoreCase("si");
                if (!guardiaActivo) {
                    System.out.println("[!] guardia requerido");
                }
            }
            // verifica alarma
            if (!sistemaAlarma) {
                System.out.println("¿Sistema de alarma habilitado?(si/no)");
                sistemaAlarma = sc.nextLine().trim().equalsIgnoreCase("si");
                if (!sistemaAlarma) {
                    System.out.println("[!] Sistema de alarma requerido");
                }
            }
            if (!(cercaElectrica && camarasSurveillance && guardiaActivo && sistemaAlarma)) {
                System.out.println("[ALERTA] medidas incompletas. reiniciando verificacion....\n  ");
            }
        } while (!(cercaElectrica && camarasSurveillance && guardiaActivo && sistemaAlarma));

        System.out.println("\n [OK] Todas las medidas de seguridad estan activas...");
        System.out.println("El parque esta listo para abrir !Esperemos que nos dinosaurios no escapen!...");
    }
}
