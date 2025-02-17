package Aula_03.Solid.Exercicios_S_O.Exercicio04;

import Aula_03.Solid.Exercicios_S_O.Exercicio04.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class ControleDeEstoque {
    public static List<Produto> produtosEstoque = new ArrayList<>();

    public static void adicionarEstoque(Produto produto) {
        produtosEstoque.add(produto);
    }

    public static void adicionarEstoque(List<Produto> produtos) {
        produtosEstoque.addAll(produtos);
    }

    public static void removerEstoque(Produto produto) {
        produtosEstoque.remove(produto);
    }

    public static void removerEstoque(List<Produto> produtos) {
        produtosEstoque.removeAll(produtos);
    }

    public static void atualizarQuantidade(int id, int quantidade) {
        Produto produto = procurarProduto(id);
        produto.setQuantidade(quantidade);
    }

    public static Produto procurarProduto(int id) {
        for (Produto produto : produtosEstoque) {
            if (id == produto.getIdentificador()){
                return produto;
            }
        }
        return null;
    }

    public static List<Produto> listarProdutos() {
        for (Produto produto : produtosEstoque) {
            System.out.println(produto);
        }
        return produtosEstoque;
    }
}
