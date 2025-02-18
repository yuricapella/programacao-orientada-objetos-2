package Aula_03.Solid_S_O.Exercicios.Exercicio02.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private static List<Double> precos = new ArrayList<>();

    public void adicionarPrecos(double preco) {
        precos.add(preco);
    }

    public static double calcularTotal() {
        double total = 0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }

    public static List<Double> getPrecos() {
        return precos;
    }

}
