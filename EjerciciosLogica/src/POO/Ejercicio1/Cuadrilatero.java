package POO.Ejercicio1;

public class Cuadrilatero {

    // Atributos
    private double lado1;
    private double lado2;

    // Metodos

    // Constructor 1 (Cuadrilatero)
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // constructor 2 (cuadrado)
    public Cuadrilatero(double lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public double getPerimetro() {
        double perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public double getArea() {
        double area = (lado1 * lado2);
        return area;
    }

}
