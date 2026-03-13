package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }

    public static int pedirNumero(Scanner input) {
        System.out.println("Ingrese El Numero:");

        try{
            int num = input.nextInt();
            return num;
        }catch (InputMismatchException e){
            System.out.println("Error: ");
        }
    }

}
