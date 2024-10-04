package Secao8.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class aula70_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        Estudante_aula70 estudante = new Estudante_aula70();

        System.out.print("Entre com o nome: ");
        estudante.nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        estudante.nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        estudante.nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        estudante.nota3 = scanner.nextDouble();

        System.out.println("Soma das notas: " + estudante.soma_notas());

        if (estudante.soma_notas() >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.print(estudante.reprovado());
        }

        scanner.close();
    }
}