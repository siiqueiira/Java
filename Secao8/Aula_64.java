package Secao8.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class aula64 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle_aula64 x, y;
        x = new Triangle_aula64();
        y = new Triangle_aula64();

        System.out.println("Entre com as medidas 'x' do triângulo:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas 'y' do triângulo:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.2f%n", areaX);
        System.out.printf("Área do triângulo Y: %.2f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }

} 
