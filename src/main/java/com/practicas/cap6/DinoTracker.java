package com.practicas.cap6;

public class DinoTracker {
    public static void main(String[] args) {
        // Inicializacion de arrays
        String[] dinoNames = new String[10];
        int[] dinoAges = new int[10];
        String[] dinoSpecies = new String[10];
        int[] dinoEnclosures = new int[10];
        double[] dinoWeights = new double[10]; // en Kg.

        // entrada de datos de 10 dinosaurios
        dinoNames[0] = "Rex";
        dinoAges[0] = 12;
        dinoSpecies[0] = "Tyranosurus Rex";
        dinoEnclosures[0] = 1;
        dinoWeights[0] = 8000.0;

        dinoNames[1] = "Blue";
        dinoAges[1] = 6;
        dinoSpecies[1] = "Velociraptor";
        dinoEnclosures[1] = 2;
        dinoWeights[1] = 15.0;

        dinoNames[2] = "Trina";
        dinoAges[2] = 20;
        dinoSpecies[2] = "Triceratops";
        dinoEnclosures[2] = 3;
        dinoWeights[2] = 5000.0;

        dinoNames[3] = "Bruno";
        dinoAges[3] = 35;
        dinoSpecies[3] = "Brachiosaurus";
        dinoEnclosures[3] = 4;
        dinoWeights[3] = 56000.0;

        dinoNames[4] = "Steggy";
        dinoAges[4] = 9;
        dinoSpecies[4] = "Stegosaurus";
        dinoEnclosures[4] = 5;
        dinoWeights[4] = 3500.0;

        dinoNames[5] = "Anky";
        dinoAges[5] = 14;
        dinoSpecies[5] = "Ankylosaurus";
        dinoEnclosures[5] = 3;
        dinoWeights[5] = 6000.0;

        dinoNames[6] = "Petra";
        dinoAges[6] = 5;
        dinoSpecies[6] = "Pterodactilo";
        dinoEnclosures[6] = 6;
        dinoWeights[6] = 10.0;

        dinoNames[7] = "Spike";
        dinoAges[7] = 18;
        dinoSpecies[7] = "Spinosaurus";
        dinoEnclosures[7] = 1;
        dinoWeights[7] = 7000.0;

        dinoNames[8] = "Dippy";
        dinoAges[8] = 25;
        dinoSpecies[8] = "Diplodocs";
        dinoEnclosures[8] = 4;
        dinoWeights[8] = 15000.0;

        dinoNames[9] = "Cera";
        dinoAges[9] = 8;
        dinoSpecies[9] = "ceratosaurus";
        dinoEnclosures[9] = 2;
        dinoWeights[9] = 1000.0;

        // mostrar detalle de cada dino
        System.out.println("============================");
        System.out.println("        Dino Tracker        ");
        System.out.println("----------------------------");
        System.out.println();
        System.out.printf("%-3s %-10s %-5s %-22s %-10s %-12s%n", '#', "Nombre", "Edad", "Especie", "Recinto",
                "Peso(Kg.)");
        for (int i = 0; i < dinoNames.length; i++) {
            System.out.printf("%-3d %-10s %-5d %-22s %-10d %-12.1f%n",
                    i + 1,
                    dinoNames[i],
                    dinoAges[i],
                    dinoSpecies[i],
                    dinoEnclosures[i],
                    dinoWeights[i]);
        }
        // calculo de promedios
        int totalEdades = 0;
        double totalPesos = 0.0;

        for (int i = 0; i < dinoNames.length; i++) {
            totalEdades += dinoAges[i];
            totalPesos += dinoWeights[i];
        }

        double promedioEdades = (double) totalEdades / dinoNames.length;
        double promedioPesos = totalPesos / dinoNames.length;

        System.out.println("-------------------------------------");
        System.out.printf("Edad promedio: %.2f años %n", promedioEdades);
        System.out.printf("Peso promedio: %.2f Kg. %n", promedioPesos);

    }
}
