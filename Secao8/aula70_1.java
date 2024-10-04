package Secao8.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class aula70_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo_aula70 retangulo = new Retangulo_aula70();

        System.out.println("Enter rectangle width and height");

        System.out.print("width: ");
        retangulo.width = scanner.nextDouble();

        System.out.print("height: ");
        retangulo.height = scanner.nextDouble();

        System.out.println("AREA: " + retangulo.calcArea());
        System.out.println("PERIMETER: " + retangulo.calcPeri());
        System.out.println("DIAGONAL: " + retangulo.calcDiag());

        scanner.close();
    }
}