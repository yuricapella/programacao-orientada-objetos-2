package Aula_03.Solid.Exercicios_S_O.Exercicio03;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<String> itens = new ArrayList<>();
    private double pesoTotal;

    public void adicionarItem (String item, double peso) {
        itens.add(item);
        pesoTotal += peso;
    }

    public List<String> getItens() {
        return itens;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }
}
