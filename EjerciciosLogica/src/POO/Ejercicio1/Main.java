package POO.Ejercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero c1;
        double lado1, lado2;

        JOptionPane.showMessageDialog(null, "Bienvenido Ingrese los lados del cuadrilatero", "Calcular",
                JOptionPane.INFORMATION_MESSAGE);

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1 del cuadrilatero: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2 del cuadrilatero: "));

        String tipoFigura = lado1 == lado2 ? "Cuadrado" : "Cuadrilatero";

        if (lado1 == lado2) { // es un cuadrado
            c1 = new Cuadrilatero(lado1);
            JOptionPane.showMessageDialog(null, "Figura detectada: " + tipoFigura, "Tipo Figura",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            c1 = new Cuadrilatero(lado1, lado2); // es un cuadrilatero
            JOptionPane.showMessageDialog(null, "Figura detectada: " + tipoFigura, "Tipo Figura",
                    JOptionPane.INFORMATION_MESSAGE);

        }

        System.out.println("-----------------------------------------------------");
        System.out.println("El perimetro del " + tipoFigura + " es: " + c1.getPerimetro());
        System.out.println("El area del " + tipoFigura + " es: " + c1.getArea());
        System.out.println("-----------------------------------------------------");

        JOptionPane.showMessageDialog(null, "El perimetro del " + tipoFigura + " es: " + c1.getPerimetro() + "\n" +
                "El area del " + tipoFigura + " es: " + c1.getArea(), "Resultados", JOptionPane.INFORMATION_MESSAGE);

    }
}
