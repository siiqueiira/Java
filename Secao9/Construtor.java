package Secao9.Construtores;

import java.util.Locale; /* Representa uma região geográfica */
import java.util.Scanner; /* Entrada de dados (input) */

public class Construtor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); /* Definição da localização */
        Scanner scanner = new Scanner(System.in); /* Criação objeto scanner */

        System.out.println("Entre com os dados do produto");

        System.out.print("Nome: ");
        String nome = scanner.nextLine(); /* Armazena a entrada na váriavel produto no campo nome. */

        System.out.print("Preço: ");
        double preco = scanner.nextDouble(); /* Armazena a entrada na váriavel produto no campo preco. */

        /* System.out.print("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt(); /* Armazena a entrada na váriavel produto no campo estoque. */

        Classe_construtor produto = new Classe_construtor(nome, preco);

        /*Classe_construtor p = new Classe_construtor(), Exemplo que o construtor padrão ainda pode ser usado junto com outros*/

        System.out.println();
        System.out.println("Dados do produto: " + produto); /* Em um print, implicitamente ele já chama o toString do objeto */

        System.out.println();
        System.out.print("Entre com o número de produtos a ser adicionado no estoque: ");
        int quantidade = scanner.nextInt();
        produto.addProducts(quantidade); /* Faz a atualização da quantidade, dentro do objeto produto */

        System.out.println();
        System.out.println("Dados atualizados do produto: " + produto);

        System.out.println();
        System.out.print("Entre com o número de produtos a ser removido do estoque: ");
        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade); /* Faz a atualização da quantidade, dentro do objeto produto */

        System.out.println();
        System.out.println("Dados atualizados do produto: " + produto);

        /*System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade); */

        scanner.close();
    }
}

