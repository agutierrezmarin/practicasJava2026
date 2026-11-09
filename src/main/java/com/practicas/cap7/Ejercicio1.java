package com.practicas.cap7;

public class Ejercicio1 {
    public static void main(String[] args) {
        // determinar la etaoa de vida de un dinosaurio segun su edad
        /*
         * @param age es la edad del dinosaurio en años (debe ser >=0)
         * 
         * @return "hatchling" si la edad es <= 2, juvenile si es <=9, adult en otro cas
         */
        System.out.println(lifeStage(1));
        System.out.println(lifeStage(9));
        System.out.println(lifeStage(16));
    }

    static String lifeStage(int age) {
        if (age <= 2) {
            return "hatchling";

        } else if (age <= 9) {
            return "juvenile";
        } else {
            return "adult";
        }
    }
}
