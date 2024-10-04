package Secao8.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class aula70_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario_aula70 funcionario = new Funcionario_aula70();

        System.out.print("Name: ");
        funcionario.name = scanner.nextLine();

        System.out.print("Gross Salary: ");
        funcionario.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.printf("Employee: " + funcionario.name + ", " + funcionario.netSalary());

        System.out.println();
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextInt();
        funcionario.increaseSalary(percentage);

        System.out.println();

        System.out.printf("Update data: " + funcionario.toString());

        scanner.close();
    }
}