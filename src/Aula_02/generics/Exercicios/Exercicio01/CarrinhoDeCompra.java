package Aula_02.generics.Exercicios.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra<T> {
    private List<T> lista;

    public CarrinhoDeCompra() {
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        this.lista.add(item);
    }

    public void removerItem(T item) {
        this.lista.remove(item);
    }

    public List<T> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                lista.toString() +
                '}';
    }
}
