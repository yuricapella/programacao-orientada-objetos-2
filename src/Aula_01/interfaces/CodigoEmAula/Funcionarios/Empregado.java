package Aula_01.interfaces.CodigoEmAula.Funcionarios;

import java.math.BigDecimal;

public class Empregado implements Comparable{

    private int matricula;
    private String nome;
    private BigDecimal salario;

    public Empregado(String nome,int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public int compareTo(Object other) {
        Empregado empregado = (Empregado) other;
        if (this.matricula < empregado.matricula) {
            return -1;
        }
        if (this.matricula > empregado.matricula) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
