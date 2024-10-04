package Secao8.Retangulo;

public class Retangulo_aula70 { /* Atributos da classe */

    public double width;
    public double height;

    public double calcArea() {
        return width * height;
    }

    public double calcPeri() {
        return (width * 2) + (height * 2);
    }

    public double calcDiag() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}