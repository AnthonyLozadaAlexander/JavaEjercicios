package Logica;

import java.util.Arrays;

public class PlusOneEx_2 {
    public static void main(String[] args) {
        int[] result = plusOne(new int[] { 1, 9 }); // Ingresa un array de enteros
        for (int digit : result)
            System.out.println(digit + " "); // Imprime el array de enteros
    }

    public static int[] plusOne(int[] digits) {
        // crear un nuevo array para almacenar el resultado
        int[] newDigits;
        // llamar a la función recursiva para sumar uno al array de enteros
        newDigits = plusOne(digits, digits.length - 1);
        return newDigits;

    }

    // funcion recursiva para sumar uno al array de enteros, con parametro index
    // para controlar la posición del array

    public static int[] plusOne(int[] digits, int index) {
        // en caso de sobrepasar el índice del array, se crea un nuevo array con un
        // dígito adicional para almacenar el resultado
        if (index == -1) {
            int[] newDigits = new int[digits.length + 1];
            Arrays.fill(newDigits, 0); // llenar el nuevo array con ceros
            newDigits[0] = 1; // asignar el primer dígito del nuevo array a 1, ya que se ha sumado uno al
                              // array original
            return newDigits;
        }

        // si el dígito actual del array es 9, se establece a 0 y se llama
        // recursivamente a la función para sumar uno al siguiente dígito del array
        if (digits[index] == 9) {
            digits[index] = 0; // establecer el dígito 9 a 0

            // llamar recursivamente a la función para sumar uno al siguiente dígito del
            // array
            return plusOne(digits, index - 1);
        }

        digits[index]++; // sumar uno al dígito actual del array
        return digits;
    }

}
