package POO.Ejercicio2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class juegoMovimiento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Objeto obj = new Objeto(5, 5); // creacion del objeto y inicializacion de sus coordenadas en (5, 5)

        System.out.println("Juego de Movimiento del Objeto");
        System.out.println("El tablero es de 10x10, las coordenadas van de (0,0) a (9,9)");
        obj.mostrarPosicion();

        while (true) {
            System.out.println("\n¿A donde desea mover el objeto?");
            System.out.println("1 = Arriba (↑)");
            System.out.println("2 = Abajo (↓)");
            System.out.println("3 = Izquierda (←)");
            System.out.println("4 = Derecha (→)");
            System.out.println("5 = Salir del juego");
            System.out.println("Elija una opcion");
            System.out.print("-> ");
            int opcion = input.nextInt();

            if (opcion == 1) {
                obj.moverArriba();
            } else if (opcion == 2) {
                obj.moverAbajo();
            } else if (opcion == 3) {
                obj.moverIzquierda();
            } else if (opcion == 4) {
                obj.moverDerecha();
            } else if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Saliendo Del Programa, Gracias", "Saliendo",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                System.out.println("Opcion no valida, por favor elija una opcion del 1 al 5.");
                JOptionPane.showMessageDialog(null, "Opcion no valida, por favor elija una opcion del 1 al 5.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

            obj.mostrarPosicion();

        }

        input.close();

    }
}
