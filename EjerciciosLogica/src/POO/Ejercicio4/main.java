package POO.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void agregarEstudiante(ArrayList<Estudiante> listaEstudiantes, String nombre, int edad,
            String carrera) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, carrera);
        listaEstudiantes.add(nuevoEstudiante);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Estudiante> EstudianteList = new ArrayList<>();

        System.out.println("------------------------------------------------");
        System.out.println("Bienvenido Al Sistema de Registro de Estudiantes");
        System.out.println("------------------------------------------------");

        String nombre = "";
        int edad = 0;
        String carrera = "";

        System.out.println("Ingrese El Nombre Del Estudiante: ");
        nombre = input.nextLine();
        System.out.println("Ingrese La Edad Del Estudiante: ");
        edad = input.nextInt();

        input.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese La Carrera Del Estudiante: ");
        carrera = input.nextLine();

        agregarEstudiante(EstudianteList, nombre, edad, carrera);

    }
}
