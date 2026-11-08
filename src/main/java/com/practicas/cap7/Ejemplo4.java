package com.practicas.cap7;

public class Ejemplo4 {
    public static void main(String[] args) {
        int x = 19;
        int[] arr = { 1, 2 };

        callByvalue(x, arr); // primera llamada el retorno de x va ser ignorado
        System.out.println("valor de X: " + x);// imprime el valor que se define aqui de x que es 19
        System.out.println("array: [" + arr[0] + "," + arr[1] + "]"); // imprime -1, -2 el arr ya cambio por la funcion
                                                                      // que se llamo antes
        x = callByvalue(x, arr); // segunda llamada el valor de x recien es tomado en cuenta
        System.out.println("El nuevo valor de x: " + x);

    }

    private static int callByvalue(int x, int[] arr) {
        x = -1; // modifica la copia primitiva de x
        arr[0] = -1; // modifica el OBJETO al que apunta la copia de la referencia
        return x;
    }
}
