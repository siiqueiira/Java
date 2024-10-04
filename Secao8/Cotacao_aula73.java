package Secao8.Cotacao;

public class Cotacao_aula73 {

    public static double valor;
    public static double dolar;
    public static final double TAXA = 6;

        public static double retorno_valor_cotado() {
            double resultado = (valor * dolar);
            double acrescimo = (TAXA * resultado) / 100;
            return resultado + acrescimo;
        }
    
}