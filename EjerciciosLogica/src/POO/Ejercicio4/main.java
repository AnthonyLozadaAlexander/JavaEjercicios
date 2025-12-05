package POO.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Estudiante> EstudianteList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void agregarEstudiante(ArrayList<Estudiante> EstudianteList, String nombre, int edad,
            String carrera) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, carrera);
        EstudianteList.add(nuevoEstudiante);
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
            System.out.println(dato.mostrarInfo());
        }
        input.close();
        main(null);

    }

    public static void modificar() {

        int index = 0;
        boolean continuar = true;
        System.out.println("Modificar Listas Estudiantes");
        if (EstudianteList.isEmpty()) {
            System.out.println("No Hay Estudiantes Registrados");
            return;
        }

        do {
            input.next();
            System.out.println("Ingrese El Nombre Del Estudiante A Modificar: ");
            String nombreBuscado = input.nextLine();
            for (int i = 0; i < EstudianteList.size(); i++) {
                if (nombreBuscado.equals(EstudianteList.get(i).getNombre())) {
                    index = i;
                    System.out.println("Estudiante Encontrado: " + EstudianteList.get(index).getNombre());
                    System.out.println("Ingrese El Nuevo Nombre: ");
                    String nuevoNombre = input.nextLine();
                    EstudianteList.get(index).setNombre(nuevoNombre);
                    continuar = false;
                    break;
                }
            }

        } while (continuar == true);
        System.out.println("Nombre Actualizado: ");
        System.out.println("Index[" + index + "]");
        System.out.println("Nombre: " + EstudianteList.get(index).getNombre());
        input.close();

    }

    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("       Sistema De Registro De Estudiantes");
        System.out.println("------------------------------------------------");
        System.out.println("1 = Agregar");
        System.out.println("2 = Modificar");
        System.out.println("3 = Buscar");
        System.out.println("4 = Eliminar");
        System.out.println("5 = Salir");
        System.out.println("------------------------------------------------");
        
        switch (input.nextLine()) {
            case "1" -> agregar();
                
                
            case "2" -> modificar();
                

            case "5" -> System.out.println("Gracias Por Usar El Sistema"); 
                
                
            default -> System.out.println("Opcion No Valida"); 
                

        }

    }
}
