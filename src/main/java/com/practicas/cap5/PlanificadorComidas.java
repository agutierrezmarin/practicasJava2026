package com.practicas.cap5;

public class PlanificadorComidas {
    public static void main(String[] args) {
        // horarios de alimentacion
        int trexManana = 8;
        int trexTarde = 14;
        int trexNoche = 20;

        int brachio1 = 7;
        int brachio2 = 11;
        int brachio3 = 15;
        int brachio4 = 19;

        // prociones kg
        int porcionTrex = 100;
        int porcionBrachio = 250;

        // acumuladores del dia
        int totalTrex = 0;
        int totalBrachio = 0;
        int totalParque = 0;

        System.out.println("=============================");
        System.out.println("=====Planificador Jurassic====");
        System.out.println("==============================");

        for (int hora = 0; hora <= 23; hora++) {
            // determinar si es la hora de alimentar al trex
            boolean esComidaTrex = (hora == trexManana) || (hora == trexTarde) || (hora == trexNoche);

            // determinar si es hora de alimentar al brachiosaur
            boolean esComidaBrachio = (hora == brachio1) || (hora == brachio2) || (hora == brachio3)
                    || (hora == brachio4);

            if (esComidaTrex) {
                System.out.println(
                        "son las " + hora + ":00 -Hora de alimentar al Trex  con:" + porcionTrex + " kg. de carne");
                totalTrex += porcionTrex;
            }

            if (esComidaBrachio) {
                System.out.println("Son las " + hora + ":00 -Hora de alimentar al brachiosaur con " + porcionBrachio
                        + " Kg. de vegetales");
                totalBrachio += porcionBrachio;
            }
            // alimentacion sileciosa no imprime nada
        }
        totalParque = totalTrex + totalBrachio;
        System.out.println("=========Resumen del dia=======");
        System.out.println("T Rex " + totalTrex + " Kg. (3 comidas)");
        System.out.println("Brachiosaur " + totalBrachio + " Kg. (4 comidas)");
        System.out.println("Total consumido: " + totalParque + " Kg.");
    }
}
