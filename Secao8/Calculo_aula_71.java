package Secao8.Circunferencia;

/* MÉTODO 2 */

public class Calculo_aula_71 {
    public double raio;

    public final double PI = 3.14159; /* Palavra final indica que o valor é uma constante e não vai mudar */

public double calculo_circunferencia() {
    return 2 * PI * raio;
}
   
public double calculo_volume() {
    return 4 * PI * Math.pow(raio, 3) / 3;
}

/* MÉTODO 3 */

    public static double teste;

    public final static double PI_met = 3.14159; /* Palavra final indica que o valor é uma constante e não vai mudar */

public static double calculo_circunferencia_met() {
    return 2 * PI_met * teste;
}
   
public static double calculo_volume_met() {
    return 4 * PI_met * Math.pow(teste, 3) / 3;
}



}
