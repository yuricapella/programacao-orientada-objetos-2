package Aula_02.Generics.Exercicios.Exercicio01_parte02;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {
    public static void listarPagamentos(List<Pagamento> pagamentos){
        for (Pagamento pagamento : pagamentos){
            System.out.println(pagamento);
        }
    }

    public static List<Pagamento> gerarPagamentos(int quantidadePix, int quantidadeCartao){
        List<Pagamento> resultado = new ArrayList<>();
        for (int i = 0; i < quantidadePix; i++){
            PagamentoPix pagamento = new PagamentoPix(50+(i*5*i));
            resultado.add(pagamento);
        }
        for (int i = 0; i < quantidadeCartao; i++){
            PagamentoCartao pagamento = new PagamentoCartao(62.33+(i*5.78*i));
            resultado.add(pagamento);
        }
        return resultado;
    }

    public static <T extends Pagamento> List<T> separarPagamentos(List<Pagamento> pagamentos, Class<T> tipo){
        List<T> resultado = new ArrayList<>();
        for (Pagamento pagamento : pagamentos){
            if (tipo.isInstance(pagamento)){
                resultado.add(tipo.cast(pagamento));
            }
        }
        return resultado;
    }
}
