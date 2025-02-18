package Aula_03.Solid_S_O.Exercicios.Exercicio04;

import Aula_03.Solid_S_O.Exercicios.Exercicio04.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class ControleDeEstoque {
    private static List<Produto> produtosEstoque = new ArrayList<>();

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
        Produto produto = listarProduto(id);
        produto.setQuantidade(quantidade);
    }

    public static Produto listarProduto(int id) {
        Produto produto = null;
        for (Produto produtoEstoque : produtosEstoque) {
            if(produtoEstoque.getIdentificador() == id) {
                produto = produtoEstoque;
                break;
            }
        }
        return produto;
    }

    public static List<Produto> listarProduto() {
        for (Produto produto : produtosEstoque) {
            System.out.println(produto);
        }
        return produtosEstoque;
    }
}
