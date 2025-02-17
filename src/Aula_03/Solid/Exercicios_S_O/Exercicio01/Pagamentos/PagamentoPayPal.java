package Aula_03.Solid.Exercicios_S_O.Exercicio01.Pagamentos;

public class PagamentoPayPal implements Pagamento {
    @Override
    public void pagar(String metodo) {
        System.out.println("Pagando com PayPal...");
    }
}
