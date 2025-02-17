package Aula_02.Generics.Exercicios.Exercicio01_parte01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra<T> {
    private List<T> lista = new ArrayList<>();;


    public void adicionarItem(T item) {
        this.lista.add(item);
    }

    public void removerItem(T item) {
        this.lista.remove(item);
    }

    public int getQuantidadeTotal() {
        return lista.size();
    }


    @Override
    public String toString() {
        return lista.toString();
    }
}
