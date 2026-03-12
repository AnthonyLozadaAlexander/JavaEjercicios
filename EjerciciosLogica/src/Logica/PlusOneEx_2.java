package Logica;

public class PlusOneEx_2 {
    public static void main(String[] args) {
        int[] result = plusOne(new int[] { 1, 3 }); // Ingresa un array de enteros
        for (int digit : result)
            System.out.println(digit + " "); // Imprime el array de enteros
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++; // sumamos 1 al ultimo elemento del arreglo
        return digits;

    }

}
