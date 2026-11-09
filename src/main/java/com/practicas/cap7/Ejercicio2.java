package com.practicas.cap7;

public class Ejercicio2 {
    public static void main(String[] args) {
        // calcular la cantidad de comida diaria que necesita un dinosaurio
        // aplicando la regla de 3% del peso corporal
        System.out.printf("comida diaria: %.2f Kg%n ", dailiFoodKg(1000));
        System.out.printf("comida diaria: %.2f Kg%n ", dailiFoodKg(50));

    }

    private static double dailiFoodKg(double weightKg) {
        /*
         * el peso del dino debe ser en kg para devolver la cantidad de comida que
         * recibe en kg.
         */
        final double FOOD_RATIO = 0.03; // 3% respecto al peso del dino
        return weightKg * FOOD_RATIO;

    }
}
