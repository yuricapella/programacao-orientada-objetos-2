package Aula_02.Generics.Exercicios.Exercicio01_parte02;

public class PagamentoPix implements Pagamento<Integer>{
    private Integer pagamento;
    private static long contador = 1;
    private final long id;

    public PagamentoPix(Integer pagamento) {
        this.id = contador++;
        this.pagamento = pagamento;
    }
    @Override
    public Integer processarPagamento(Integer valor) {
        System.out.printf("Pagamento processado com sucesso no valor de R$%d reais\n", valor);
        return valor;
    }

    public Integer getPagamento() {
        return pagamento;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("PagamentoPix %d {R$%d}\n", id, pagamento);
    }
}
