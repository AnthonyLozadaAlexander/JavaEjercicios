package POO.Ejercicio3;

import java.util.Scanner;

public class Main {

    public static double obtenerAreaMayor(Triangulo_Isosceles triangulo[]) {
        double area = 0.0;

        area = triangulo[0].obtenerArea();
        for (int i = 1; i < triangulo.length; i++) {
            if (triangulo[i].obtenerArea() > area) {
                area = triangulo[i].obtenerArea();
            }

        }

        return area;
    }

    public static int indexAreaMayorS(Triangulo_Isosceles triangulo[]) {
        double area = 0.0;
        int index = 0;
        area = triangulo[0].obtenerArea();
        for (int i = 1; i < triangulo.length; i++) {
            if (triangulo[i].obtenerArea() > area) {
                area = triangulo[i].obtenerArea();
                index = i;
            }
        }

        return index;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, lado;
        int nTriangulos, indexAreaMayorSuperficie;

        System.out.println("-----------------------------------");
        System.out.println("Cuantos Triangulos Desea Calcular?");
        nTriangulos = input.nextInt();

        Triangulo_Isosceles triangulo[] = new Triangulo_Isosceles[nTriangulos];
        for (int i = 0; i < nTriangulos; i++) {
            input.nextLine();

            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese la base del triángulo [" + (i) + "]:");
            base = input.nextDouble();
            System.out.println("Ingrese el lado del triángulo [" + (i) + "]:");
            lado = input.nextDouble();
            System.out.println("-----------------------------------------------");

            triangulo[i] = new Triangulo_Isosceles(base, lado);
            System.out.println("El perimetro del triangulo es: " + triangulo[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: " + triangulo[i].obtenerArea());

            System.out.println("-----------------------------------------------");

        }

        System.out.println("-----------------------------------");
        indexAreaMayorSuperficie = indexAreaMayorS(triangulo);
        System.out.println("El triangulo de mayor superficie es: \n"
                + "Triangulo[" + indexAreaMayorSuperficie + "] \n" +
                triangulo[indexAreaMayorSuperficie].mostrarDatos());

        System.out.println("-----------------------------------");
        System.out.println("El area mayor es: " + obtenerAreaMayor(triangulo));
        System.out.println("-----------------------------------");

        input.close();

    }

}
