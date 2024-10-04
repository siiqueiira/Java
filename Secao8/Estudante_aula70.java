package Secao8.Estudante;

public class Estudante_aula70 {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    

public double soma_notas() {
    return nota1 + nota2 + nota3;
}

public String reprovado() {
    return "Reprovado\n" + "Faltaram " + (60 - soma_notas()) + " pontos";
}

}