package Logica;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorH = 0, sueldoTotal = 0;
        // String premio = "";
        int cantH = 0, valorPremio = 0;

        System.out.println("------------------------------------------");
        System.out.println("|                BIENVENIDO               |");
        System.out.println("------------------------------------------");
        System.out.print("     Ingrese las horas trabajadas: ");
        cantH = input.nextInt();
        System.out.print("     Ingrese el valor por hora: ");
        valorH = input.nextDouble();

        if (cantH > 100) {
            valorPremio = 100;
            sueldoTotal = (cantH * valorH) + valorPremio;
        } else if (cantH > 200) {
            valorPremio = 250;
            sueldoTotal = (cantH * valorH) + valorPremio;
        } else {
            sueldoTotal = cantH * valorH;
        }

        // premio = (cantH > 250 || cantH > 100)
        // ? cantH + " Horas Trabajadas: " + valorPremio
        // : "Abono No Aplicado";

        System.out.println("-----------------------------------------");
        System.out.println("|          SUELDO CORRESPONDIDO          |");
        System.out.println("-----------------------------------------");
        System.out.println("          Horas Trabajadas: " + cantH);
        System.out.println("          Valor por Hora: " + valorH);
        System.out.println("          Abono Especial: " + valorPremio);
        System.out.println("          Sueldo Total: " + sueldoTotal);
        System.out.println("-----------------------------------------");

        input.close();
    }

}
