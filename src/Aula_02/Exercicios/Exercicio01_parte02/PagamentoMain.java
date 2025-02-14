package Aula_02.Exercicios.Exercicio01_parte02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PagamentoMain {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("Atividade da aula");
        System.out.println();

        PagamentoPix pagamentoPix = new PagamentoPix(50);
        pagamentoPix.processarPagamento(pagamentoPix.getPagamento());

        PagamentoCartao pagamentoCartao = new PagamentoCartao(150.55);
        pagamentoCartao.processarPagamento(pagamentoCartao.getPagamento());

        System.out.println("-----------------");
        System.out.println("Código a mais");
        System.out.println();

        System.out.println("Gerar e listar todos os pagamentos");
        List<Pagamento> pagamentos = SistemaPagamento.gerarPagamentos(5, 9);
        SistemaPagamento.listarPagamentos(pagamentos);

        System.out.println("-----------------");
        System.out.println("Listar pagamentos por tipo");
        System.out.println();

        List<PagamentoPix> pagamentosPix = SistemaPagamento.separarPagamentos(pagamentos,PagamentoPix.class);

        List<PagamentoCartao> pagamentosCartao = SistemaPagamento.separarPagamentos(pagamentos,PagamentoCartao.class);

        System.out.println("PIX");
        System.out.println(pagamentosPix);

        System.out.println("----------------");
        System.out.println("CARTAO");
        System.out.println(pagamentosCartao);

    }
}
