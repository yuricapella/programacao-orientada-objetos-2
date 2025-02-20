package Aula_03.Solid_S_O.Exercicios.Exercicio04.Produtos;

public abstract class Produto {
    private long identificador;
    private String nome;
    private int quantidade;
    private static long contador = 1;

    public Produto(String nome, int quantidade) {
        this.identificador = contador++;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public long getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Id=" + identificador + ", Nome='" + nome + "', Quantidade=" + quantidade;
    }
}
