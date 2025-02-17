package Aula_02.Generics.Exercicios.Exercicio01_parte02;

public interface Pagamento<T extends Number>{
    T processarPagamento(T valor);
}
