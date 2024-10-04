package Secao8.Circunferencia;

import java.util.Scanner;
import java.util.Locale;

public class aula_71 {

    public static final double PI = 3.14159; /* Palavra final indica que o valor é uma constante e não vai mudar */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este é o Método 1!\n"); /* \n para adicionar uma linha abaixo */

        System.out.print("Valor do raio: ");
        double valor = scanner.nextDouble(); /* Armazenamento do valor em valor */

        System.out.printf("Valor da circunferência: %.2f%n", 2 * PI * valor); /* %.2f%n uso de 2 casas decimais e quebra de linha */

        System.out.printf("Valor do volume: %.2f%n", 4 * PI * Math.pow(valor, 3) / 3);

        System.out.println("Valor de PI: 3.14\n");

        System.out.println("Este é o Método 2!\n");

        Calculo_aula_71 diametro = new Calculo_aula_71();

        System.out.print("Valor do raio: ");
        diametro.raio = scanner.nextDouble(); /* Armazenamento do valor do raio dentro da classe */

        System.out.printf("Valor da circunferência: %.2f%n", diametro.calculo_circunferencia()); 

        System.out.printf("Valor do volume: %.2f%n", diametro.calculo_volume()); 

        System.out.printf("Valor de PI: %.2f%n%n", diametro.PI);
        
        System.out.println("Este é o Método 3!\n");

        System.out.print("Valor do raio: ");
        Calculo_aula_71.teste = scanner.nextDouble(); /* Armazenamento do valor do raio dentro da classe */

        System.out.printf("Valor da circunferência: %.2f%n", Calculo_aula_71.calculo_circunferencia_met()); 

        System.out.printf("Valor do volume: %.2f%n", Calculo_aula_71.calculo_volume_met()); 

        System.out.printf("Valor de PI: %.2f%n", Calculo_aula_71.PI_met);

        scanner.close();
        
    }
}