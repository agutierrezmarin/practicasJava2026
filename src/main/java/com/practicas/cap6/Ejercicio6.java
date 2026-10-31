package com.practicas.cap6;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[][] mapParque = {
                { "Recinto TRex", "Area Medica", "cafeteria", "Recinto raptor" },
                { "Lago brachosauiros", "Tienda de regalos", "zona infantil", "recinto triceratops" },
                { "Helipuerto", "Recinto estegosaurus", "Estacion de jeeps", "Salida principal" }
        };
        System.out.println("=====Mapa principal del parque =====");
        System.out.println();
        for (int fila = 0; fila < mapParque.length; fila++) {
            for (int col = 0; col < mapParque[fila].length; col++) {
                System.out.printf("[F%d, C%d] %-22s", fila + 1, col + 1, mapParque[fila][col]);
            }
            System.out.println();
        }
    }
}
