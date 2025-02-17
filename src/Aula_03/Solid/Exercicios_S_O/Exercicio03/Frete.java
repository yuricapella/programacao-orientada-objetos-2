package Aula_03.Solid.Exercicios_S_O.Exercicio03;

public class Frete {

    public static double calcularFrete (double peso) {
        if (peso < 5) {
            return 10.0;
        } else if (peso < 10) {
            return 20.0;
        } else {
            return 30.0;
        }
    }
}
