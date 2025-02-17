package Aula_03.Solid.Exercicios_S_O.Exercicio04.Produtos;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeProdutos {
    public static List<Produto> gerarListaDeProdutos(int quantidadeEletronicos, int quantidadeMoveis, int quantidadePapelaria) {
        List<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < quantidadeEletronicos; i++) {
            Eletronico eletronico = new Eletronico("Eletronico "+(i+1),5*i);
            produtos.add(eletronico);
        }
        for (int i = 0; i < quantidadeMoveis; i++) {
            Movel movel = new Movel("Movel "+(i+1),5*i);
            produtos.add(movel);
        }

        for (int i = 0; i < quantidadePapelaria; i++) {
            Papelaria papelaria = new Papelaria("Caderno "+(i+1),5*i);
            produtos.add(papelaria);
        }
        return produtos;
    }
}
