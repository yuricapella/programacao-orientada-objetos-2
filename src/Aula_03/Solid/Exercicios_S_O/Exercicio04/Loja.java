package Aula_03.Solid.Exercicios_S_O.Exercicio04;

import Aula_03.Solid.Exercicios_S_O.Exercicio04.Produtos.*;

import java.util.List;

public class Loja {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("Permite adição de produtos diferentes\n");
        Eletronico eletronico = new Eletronico("TV",5);
        Movel movel = new Movel("Cadeira",5);
        Papelaria papelaria = new Papelaria("Lápis",5);

        ControleDeEstoque.adicionarEstoque(eletronico);
        ControleDeEstoque.adicionarEstoque(movel);
        ControleDeEstoque.adicionarEstoque(papelaria);

        ControleDeEstoque.listarProdutos();

        System.out.println("-------------------------------");
        System.out.println("Altera quantidade dos produtos\n");

        ControleDeEstoque.atualizarQuantidade(1,99);
        ControleDeEstoque.atualizarQuantidade(2,99);
        ControleDeEstoque.atualizarQuantidade(3,99);

        ControleDeEstoque.listarProdutos();
        System.out.println("-------------------------------");
        System.out.println("Remove um produto\n");

        ControleDeEstoque.removerEstoque(papelaria);
        ControleDeEstoque.listarProdutos();

        System.out.println("-------------------------------");
        System.out.println("CÓDIGOS A MAIS\n");
        System.out.println("Gerador de produtos, adicionar produtos em massa (Adicionando lista dentro da lista de estoque)\n");

        List<Produto> produtos = GeradorDeProdutos.gerarListaDeProdutos(2,2,2);

        ControleDeEstoque.adicionarEstoque(produtos);
        ControleDeEstoque.listarProdutos();

        System.out.println("-------------------------------");
        System.out.println("Remove produtos em massa\n");

        ControleDeEstoque.removerEstoque(produtos);
        ControleDeEstoque.listarProdutos();

    }
}
