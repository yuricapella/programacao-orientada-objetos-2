package Aula_02.Exercicios.Exercicio01_parte02;

public interface Pagamento<T extends Number>{
    T processarPagamento(T valor);
}
