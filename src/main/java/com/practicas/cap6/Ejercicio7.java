package com.practicas.cap6;

public class Ejercicio7 {
    public static void main(String[] args) {
        // 5 filas 4 columnas [A, B, pasillo, C, D]
        String[][] autobus = {
                { "Ana Garcia", "Luis Perez", "", "Maria Lopez" },
                { "Jose Ruiz", "", "Clara Diaz", "Pedro Mora" },
                { "", "Elena Vega", "Tomas Nuñez", "" },
                { "Sara Castro", "Hugo Flores", "", "" },
                { "", "", "Irene Soto", "Andres Gil" },
        };
        System.out.println("==========Plano de Asientos-Autobus==========");
        System.out.println();
        System.out.println("    [A]     [B]     [C]     [D]");
        System.out.println("======================================");
        for (int fila = 0; fila < autobus.length; fila++) {
            System.out.printf("    Fila %d", fila + 1);
            for (int col = 0; col < autobus[fila].length; col++) {
                String asiento = autobus[fila][col].isEmpty() ? "[LIBRE]" : "[" + autobus[fila][col] + "]";
                System.out.printf("%-20s", asiento);
                if (col == 1) {
                    System.out.println("|");
                }
            }
            System.out.println();
        }
        // contar asientos libres
        int libres = 0;
        for (String[] fila : autobus) {
            for (String asiento : fila) {
                if (asiento.isEmpty()) {
                    libres++;
                }
            }
        }
        System.out.println();
        System.out.println("   Asientos Libres: " + libres + "/" + (autobus.length * autobus[0].length));
    }
}
