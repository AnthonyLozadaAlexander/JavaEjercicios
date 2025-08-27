package Logica;

public class Sums {

    public static int sumaArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int diferencia = arr[i] - arr[i + 1];
            sum = sum + diferencia;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 10 };
        int temp = 0;
        int target = 9;
        int sum = 0;

        // Ordenamiento por inserción
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Ordenamiento burbuja descendente
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { // Para orden descendente
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int count = 0;
        for (int elements : arr) {
            count++;
            if (count == arr.length) {
                System.out.print(elements);
            } else {
                System.out.print(elements + ", ");
            }
        }

        int suma = sumaArray(arr);
        System.out.println("\nFuncion sumaArray = " + suma);

        for (int i = 0; i < arr.length - 1; i++) {
            int diferencia = arr[i] - arr[i + 1];
            sum = sum + diferencia;
            if (sum == target) {
                System.out.println("Suma total: " + sum);
            }
        }

    }

}
