package Secao8.Cotacao;

import java.util.Scanner;

import java.util.Locale;

public class aula_73 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /*Cotacao_aula73 teste = new Cotacao_aula73();*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor atual do Dólar: ");
        Cotacao_aula73.valor = scanner.nextDouble();

        System.out.print("Digite quantos dólares você quer comprar: ");
        Cotacao_aula73.dolar = scanner.nextDouble();

        System.out.printf("Valor a ser pago em Reais: %.2f%n", Cotacao_aula73.retorno_valor_cotado());

        scanner.close();
    }
    
}