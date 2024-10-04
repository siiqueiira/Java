package Secao7;

import java.util.Scanner;

public class Funcoes2 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        /*if (number1 > number2 && number1 > 3) {
            System.out.println("Maior número: " + number1 + (" - Number1"));
        } else if (number2 > number3) {
            System.out.println("Maior número: " + number2 + (" - Number2"));
        } else if (number1 == number2 && number2 == number3) {
            System.out.println("Todos os números são iguais");
        }
         else {
            System.out.println("Maior número: " + number3 + (" - Number3"));
        }*/

        int higher = max(a, b, c);

        showResult(higher);

        if (a == b && b == c) {
            System.out.println("Todos os números são iguais");
        }
    }

    // public para que essa função fique disponível em outras classes
    // static para poder ser chamada independente de se criar um objeto
    public static int max(int number1, int number2, int number3) /*Não precisa ser o mesmo nome da variável do prog. principal*/ {
        int aux = 0; // Esta variável não está no programa principal, somente dentro da função

        if (number1 > number2 && number1 > 3) {
            // System.out.println("Maior número: " + number1 + (" - Number1"));
            aux = number1;
        } else if (number2 > number3) {
            // System.out.println("Maior número: " + number2 + (" - Number2"));
            aux = number2;
        } else {
            // System.out.println("Maior número: " + number3 + (" - Number3"));
            aux = number3;
        }
        return aux;
    }

    // Void é usado para indicar que este método não retorna nenhum valor que possa ser reaproveitado no programa
    public static void showResult(int value) {
        System.out.println("Maior número: " + value);
    }

}