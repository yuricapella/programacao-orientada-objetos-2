package Aula_02.Generics.Exercicios.Exercicio01_parte02;

public class PagamentoCartao implements Pagamento<Double>{
    private Double pagamento;
    private static long contador = 1;
    private final long id;

    public PagamentoCartao(Double pagamento) {
        this.id = contador++;
        this.pagamento = pagamento;
    }
    @Override
    public Double processarPagamento(Double valor) {
        System.out.printf("Pagamento processado com sucesso no valor de R$%.2f reais\n", valor);
        return valor;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("PagamentoCartao %d {R$%.2f}\n", id, pagamento);
    }
}
