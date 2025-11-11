package Logica;

import java.util.Scanner;

public class ConvertidorIntToString {
    public static String intToString(int num) {
        if (num < 0) {
            return "(" + String.valueOf(num) + ")";
        }

        return String.valueOf(num);
    }

    public static int StringToInt(String str) {
        String regex = "^\\d+(\\.\\d+)?$";
        if (!str.matches(regex)) {
            System.out.println("Error: El String Ingresado No Es Un Numero Valido");
        }

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Pruebas ConvertidorIntToString ---");
        System.out.println("Ingrese Numero");
        System.out.print("-> ");
        int num = input.nextInt();
        System.out.println("Numero ingresado: " + num + "\n");
        System.out.println("Convertir Int a String:");
        System.out.println("Resultado: " + intToString(num) + "\n");
        input.nextLine(); // Limpiar buffer
    }

}
