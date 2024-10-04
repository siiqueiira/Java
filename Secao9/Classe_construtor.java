package Secao9.Construtores;

public class Classe_construtor {

    /* Atributos da classe */

    public String nome;
    public double preco;
    public int quantidade;

    public Classe_construtor(){ /* Construtor padrão ainda pode ser usado */

    }

    public Classe_construtor(String nome, double preco, int quantidade){
        this.nome = nome; /* Usando a palavra "this" referencia o atributo do objeto, sem o "this" referencia o parâmetro */
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Classe_construtor(String nome, double preco){
        // "this.nome" refere-se ao atributo da classe, enquanto "nome" se refere ao parâmetro do construtor.
        // A palavra "this" é necessária quando o nome do parâmetro e o nome do atributo são iguais.
        this.nome = nome;
        
        // Da mesma forma, "this.preco" refere-se ao atributo da classe e "preco" ao parâmetro.
        this.preco = preco;
    
        // O atributo "quantidade" é inicializado com 0. Isso é opcional, pois o Java já define 0 como valor padrão para variáveis numéricas.
        // A palavra "this" também é opcional aqui, pois não há conflito de nomes.
        quantidade = 0;
    }

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
