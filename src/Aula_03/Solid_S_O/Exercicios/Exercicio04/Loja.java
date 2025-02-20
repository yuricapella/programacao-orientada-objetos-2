package Aula_03.Solid_S_O.Exercicios.Exercicio04;

import Aula_03.Solid_S_O.Exercicios.Exercicio04.Produtos.*;

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

        ControleDeEstoque.listarProduto();


        System.out.println("-------------------------------");
        System.out.println("Altera quantidade dos produtos\n");

        ControleDeEstoque.atualizarQuantidade(1,99);
        ControleDeEstoque.atualizarQuantidade(2,99);
        ControleDeEstoque.atualizarQuantidade(3,99);

        ControleDeEstoque.listarProduto();

        System.out.println("-------------------------------");
        System.out.println("Remove um produto\n");

        ControleDeEstoque.removerEstoque(papelaria);
        ControleDeEstoque.listarProduto();

        System.out.println("-------------------------------");
        System.out.println("CÓDIGOS A MAIS\n");
        System.out.println("Gerador de produtos, adicionar produtos em massa (Adicionando lista dentro da lista de estoque)\n");

        List<Produto> produtos = GeradorDeProdutos.gerarListaDeProdutos(2,2,2);

        ControleDeEstoque.adicionarEstoque(produtos);
        ControleDeEstoque.listarProduto();

        System.out.println("-------------------------------");
        System.out.println("Remove produtos em massa\n");

        ControleDeEstoque.removerEstoque(produtos);
        ControleDeEstoque.listarProduto();

        System.out.println("-------------------------------");
        System.out.println("Lista um produto especifico por ID\n");

        System.out.println(ControleDeEstoque.listarProduto(1));

    }
}
