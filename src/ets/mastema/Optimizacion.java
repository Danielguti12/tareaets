package ets.mastema;

import java.util.Random;


public class Optimizacion {

    private static boolean esPrimo(final int num) {
        if (num != 0) {
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int factorial(final int numero) {
        int resultado = 1;
        int numi = numero;
        while (numi > 1) {
            resultado *= numi;
            numi--;
        }
        return resultado;
    }

    public static void main(final String[] args) {
        final Random numr = new Random();
        final int valor = numr.nextInt(9);
        if (valor == 0) {
            System.out.println("0 NO ES PRIMO NI NO PRIMO");
        } else {
            final boolean primo = esPrimo(valor);
            if (primo) {
                System.out.println(valor + " ES PRIMO");
            } else {
                System.out.println(valor + " NO ES PRIMO");
            }
            System.out.println("Y SU FACTORIAL ES: " + factorial(valor));
            if (valor % 2 != 0) {
                System.out.println("Y ADEMÁS ES IMPAR");
            }
            if (valor > 4 && valor < 8) {
                System.out.println("Y ESTÁ COMPRENDIDO ENTRE 4 Y 8");
            }
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
