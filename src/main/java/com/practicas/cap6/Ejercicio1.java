package com.practicas.cap6;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] especies = {
                "Tyranosurus rex",
                "Velociraptor",
                "triceratops",
                "Brachiosauros",
                "Ankylosaurus",
                "Estegosauros",
                "Pterodactylus",
                "Spinosauros"
        };
        System.out.println("=====Inventario de Especies=====");
        for (int i = 0; i < especies.length; i++) {
            System.out.println((i + 1) + ". " + especies[i]);
        }
        System.out.println("Total especies: " + especies.length);
    }
}
