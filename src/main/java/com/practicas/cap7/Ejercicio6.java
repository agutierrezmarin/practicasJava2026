package com.practicas.cap7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercicio6 {
    public static void main(String[] args) {
        if (isParkOpem()) {
            System.out.println("el parque esta abierto !Bienvenidos¡");
        } else {
            System.out.println("El parque esta cerrado. Vuelve mañana!");
        }
    }

    private static boolean isParkOpem() {
        LocalTime now = LocalTime.now();
        LocalTime open = LocalTime.of(8, 0);
        LocalTime close = LocalTime.of(21, 0);
        return !now.isBefore(open) && now.isBefore(close);
    }
}
