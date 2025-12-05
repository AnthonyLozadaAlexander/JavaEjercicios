package POO.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Estudiante> EstudianteList = new ArrayList<>();

    public static void agregarEstudiante(ArrayList<Estudiante> listaEstudiantes, String nombre, int edad,
            String carrera) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, carrera);
        listaEstudiantes.add(nuevoEstudiante);
    }

    public static void agregar() {
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("Bienvenido Al Sistema de Registro de Estudiantes");
        System.out.println("------------------------------------------------");

        String nombre = "";
        int edad = 0;
        String carrera = "";
        String next = "";
        boolean continuar = true;

        do {
            System.out.println("Ingrese El Nombre Del Estudiante: ");
            nombre = input.nextLine();
            System.out.println("Ingrese La Edad Del Estudiante: ");
            edad = input.nextInt();

            input.nextLine(); // Limpiar el buffer

            System.out.println("Ingrese La Carrera Del Estudiante: ");
            carrera = input.nextLine();

            agregarEstudiante(EstudianteList, nombre, edad, carrera);
            System.out.println("¿Desea Agregar Otro Estudiante?");
            System.out.println("1 = si / 2 = no");
            next = input.nextLine();
            if (next.equals("2")) {
                continuar = false;
            } else {
                continuar = true;
            }
        } while (continuar == true);

        System.out.println("------------------------------------------------");
        System.out.println("           Estudiantes Registrados");
        System.out.println("------------------------------------------------");
        for (Estudiante dato : EstudianteList) {
            System.out.println(dato.getNombre() + "\n"
                    + dato.getEdad() + "\n"
                    + dato.getCarrera() + "\n");

        }
    }

    public static void modificar() {
        System.out.println("Modificar Listas Estudiantes");
        int index = 0;
        System.out.println("Ingrese El Indice Del Estudiante A Modificar");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1 = Agregar");
        System.out.println("2 = Modificar");
        System.out.println("3 = Buscar");
        System.out.println("4 = Eliminar");
        System.out.println("5 = Salir");
        switch (input.nextLine()) {
            case "1":
                agregar();
                break;
            case "2":
                modificar();
                break;
            case "3":

                break;
            case "4":

                break;

            case "5":
                System.out.println("Gracias Por Usar El Sistema");
                break;
            default:
                System.out.println("Opcion No Valida");

        }

    }
}
