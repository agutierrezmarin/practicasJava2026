package com.practicas.cap6;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] empleados = {
                "laura Sanchez",
                "Carlos Mendoza",
                "Ana Torrez",
                "Miguel Rios",
                "Sofia Herrera"
        };
        System.out.println("=======Personal del parque=======");
        for (String empleado : empleados) {
            System.out.println("- " + empleado);
        }

    }
}
