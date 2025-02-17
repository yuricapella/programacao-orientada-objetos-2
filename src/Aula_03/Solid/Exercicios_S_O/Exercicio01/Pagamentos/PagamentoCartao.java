package Aula_03.Solid.Exercicios_S_O.Exercicio01.Pagamentos;

public class PagamentoCartao implements Pagamento {

    @Override
    public void pagar(String metodo) {
        System.out.println("Pagando com cartão de crédito...");
    }
}
