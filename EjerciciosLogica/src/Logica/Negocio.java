package Logica;

import java.util.Scanner;

public class Negocio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo = 0, precioU = 0, cantidadC = 0, cantidadL = 0, cantidadB = 0, cantidadR = 0, pagarC = 0, pagarL = 0,
                pagarB = 0, pagarR = 0, cantidadAr = 0;
        double totalPagar = 0.0;
        System.out.println("----------------------------------------------------");
        System.out.println("            Bienvenido al Sistema De Ventas");
        System.out.println("----------------------------------------------------");
        System.out
                .println("Codigo 1: Cuaderno 10$" + "\n" + "Codigo 2: Lapiz $7" + "\n" + "Codigo 3: Borrador $3" + "\n"
                        + "Codigo 4: Resaltador $1\n");
        System.out.println("----------------------------------------------------");
        System.out.println("          Cuantos Articulos Desea Comprar?");
        cantidadAr = input.nextInt();
        System.out.println("----------------------------------------------------");
        int count = 0;
        do {
            System.out.print("Ingrese El Codigo Del Producto: ");
            codigo = input.nextInt();
            switch (codigo) {
                case 1:
                    precioU = 10;
                    System.out.println("Producto Elegido: Cuaderno");
                    System.out.print("Ingrese la cantidad de unidades: ");
                    cantidadC = input.nextInt();
                    pagarC += precioU * cantidadC;

                    break;
                case 2:
                    precioU = 7;
                    int cantidadCajas = 0;
                    int cajaLapizPrecio = 65;
                    int opcion = 0;
                    System.out.println("Producto Elegido: Lapiz");
                    System.out.println("Desea comprar una caja de lapices? (1: Si, 2: No)");
                    opcion = input.nextInt();
                    if (opcion == 1) {
                        System.out.print("Cuantas Cajas Desea Comprar: ");
                        cantidadCajas = input.nextInt();
                        pagarL += cantidadCajas * cajaLapizPrecio;
                    } else if (opcion == 2) {
                        System.out.print("Ingrese la cantidad de unidades: ");
                        cantidadL = input.nextInt();
                        pagarL += precioU * cantidadL;
                    } else {
                        System.out.println("ERROR: Opcion no valida");
                    }

                    break;
                case 3:
                    precioU = 10;
                    System.out.println("Producto Elegido: Borrador");
                    System.out.print("Ingrese la cantidad de unidades: ");
                    cantidadB = input.nextInt();
                    pagarB += precioU * cantidadB;

                    break;

                case 4:
                    precioU = 1;
                    System.out.println("Producto Elegido: Resaltador");
                    System.out.print("Ingrese la cantidad de unidades: ");
                    cantidadR = input.nextInt();
                    pagarR += precioU * cantidadR;

                    break;
                default:
                    System.out.println("ERROR: Codigo No Identificado");
                    break;

            }
            count++;
        } while (count < cantidadAr);
        totalPagar = pagarC + pagarL + pagarB + pagarR;
        System.out.println("----------------------------------------------------");
        System.out.println("               Productos Escogidos: ");
        System.out.println("----------------------------------------------------");
        System.out.println("         Cuaderno: " + cantidadC + " unidades");
        System.out.println("         Lapiz: " + cantidadL + " unidades");
        System.out.println("         Borrador: " + cantidadB + " unidades");
        System.out.println("         Resaltador: " + cantidadR + " unidades");
        System.out.println("----------------------------------------------------");
        System.out.println("             Total a Pagar: $" + totalPagar);
        System.out.println("----------------------------------------------------");
    }

}
