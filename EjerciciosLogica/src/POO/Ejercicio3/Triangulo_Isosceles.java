package POO.Ejercicio3;

public class Triangulo_Isosceles {
    private double base;
    private double lado;

    // Metodo Constructor
    public Triangulo_Isosceles(double _base, double _lado) {
        this.base = _base;
        this.lado = _lado;
    }

    // Metodos
    public double obtenerPerimetro() {
        double perimetro = (lado * 2) + base;
        return perimetro;
    }

    public double obtenerArea() {
        double area = (base * Math.sqrt(lado * lado - ((base * base) / 4))) / 2;
        return area;
    }

    public String mostrarDatos() {
        return "<Triángulo Isósceles>\nBase: " + base +
                "\nLado: " + lado +
                "\nPerímetro: " +
                obtenerPerimetro() +
                "\nÁrea: " +
                obtenerArea() +
                "\n";
    }
}
