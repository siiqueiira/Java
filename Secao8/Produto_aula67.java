package Secao8.Produtos;

public class Produto_aula67 {

    /* Atributos da classe */

    public String nome;
    public double preco;
    public int quantidade;

    /* Criação de funções/métodos */

    public double valorTotaNoEstoque() {
        return preco * quantidade;
    }

    /* Essa operação não tem retorno (void), somente altera o valor da quantidade */
    public void addProducts(int quantidadeAdicionada /* <-- Argumento */) {
        this.quantidade += quantidadeAdicionada; /* Neste caso o this. é uma palavra reservada, que chama o atributo da classe, e não o parâmetro da função (quantidadeAdicionada) */
    }

    public void removerProdutos(int quantidadeRemovida) {
        this.quantidade -= quantidadeRemovida;
    }

    public String toString() { /* Sobrepoe o método toString */
        return nome
            + ", R$ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, "
            + "total: R$"                                    
            + String.format("%.2f", valorTotaNoEstoque());
    }

}