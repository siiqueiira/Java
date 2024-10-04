package Secao7;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        if (number1 > number2 && number1 > 3) {
            System.out.println("Maior número: " + number1 + (" - Number1"));
        } else if (number2 > number3) {
            System.out.println("Maior número: " + number2 + (" - Number2"));
        } else if (number1 == number2 && number2 == number3) {
            System.out.println("Todos os números são iguais");
        }
         else {
            System.out.println("Maior número: " + number3 + (" - Number3"));
        }

    }
}
