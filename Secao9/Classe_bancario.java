package Secao9.Conta_bancaria;

public class Classe_bancario {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Classe_bancario(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public Classe_bancario(String nomeTitular, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        deposito(saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public String toString(){
        return "Número da conta: " + numeroConta + ", Nome: " + nomeTitular + ", Saldo: " + saldo;
    }

}
