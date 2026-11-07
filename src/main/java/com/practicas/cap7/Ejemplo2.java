package com.practicas.cap7;

public class Ejemplo2 {
    public static void main(String[] args) {
        int result = performCalc(20, 12, "*");
        System.out.println(result);
    }

    private static int performCalc(int x, int y, String operation) {
        int result = switch (operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            case "%" -> x % y;
            default -> {
                System.out.println("No se reconoce la operacion: " + operation);
                yield -1;
            }
        };
        return result;
    }
}
