package Aula_03.Solid_S_O.Exercicios.Exercicio01.Pagamentos;

public class PagamentoPayPal implements Pagamento {
    @Override
    public void pagar(String metodo) {
        System.out.println("Pagando com PayPal...");
    }
}
