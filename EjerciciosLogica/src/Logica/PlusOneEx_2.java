package Logica;

import java.util.Arrays;

public class PlusOneEx_2 {
    public static void main(String[] args) {
        int[] result = plusOne(new int[] { 1, 9 }); // Ingresa un array de enteros
        for (int digit : result)
            System.out.println(digit + " "); // Imprime el array de enteros
    }

    public static int[] plusOne(int[] digits) {
        int[] newDigits;
        newDigits = plusOne(digits, digits.length - 1);
        return newDigits;

    }

    public static int[] plusOne(int[] digits, int index) {
        if (index == -1) {
            int[] newDigits = new int[digits.length + 1];
            Arrays.fill(newDigits, 0);
            newDigits[0] = 1;
            return newDigits;
        }

        if (digits[index] == 9) {
            digits[index] = 0;
            return plusOne(digits, index - 1);
        }
        digits[index]++;
        return digits;
    }

}
