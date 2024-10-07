package Secao9.Conta_bancaria;

import java.util.Scanner;
import java.util.Locale;

public class Bancario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Classe_bancario conta;

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Gostaria de fazer um depósito inicial? (S/N): ");
        char decisao = scanner.next().charAt(0);

        if (decisao == 's') {
            System.out.print("Digite o valor do depósito: ");
            double depositoInicial = scanner.nextDouble();
            conta = new Classe_bancario(nomeTitular, numeroConta, depositoInicial);

        } else {
            conta = new Classe_bancario(nomeTitular, numeroConta);
        }

        System.out.println();
        System.out.println("Dados bancários");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println();

        System.out.println("Dados bancários atualizados");
        System.out.print(conta);

        System.out.println();
        System.out.println();
        System.out.print("Digite o valor do saque: ");

        double valorSaque = scanner.nextDouble();
        System.out.println();
        conta.saque(valorSaque);

        System.out.println("Dados bancários atualizados");
        System.out.print(conta);

        scanner.close();
    }
}
