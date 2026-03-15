package Logica;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al programa de la serie de Fibonacci");
        System.out.println("Ingrese el limite de la serie de Fibonacci: ");
        int limite = input.nextInt();

    }

    public static void calcularFibonacci(int limite) {
        int[] serie = new int[limite];
        serie[0] = 0;
        serie[1] = 1;
        for (int i = 0; i < serie.length; i++) {
            if (i > 1) {
                serie[i] = serie[i - 1] + serie[i - 2];
            }
        }
    }

}
