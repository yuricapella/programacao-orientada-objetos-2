package Aula_05.Solid_ID.Exercicios.Exercicio_02;

import Aula_05.Solid_ID.Exercicios.Exercicio_02.Funcionarios.OperadorDeMaquina;
import Aula_05.Solid_ID.Exercicios.Exercicio_02.Funcionarios.ProgramadorJunior;
import Aula_05.Solid_ID.Exercicios.Exercicio_02.Interfaces.Descansar;

public class Main {
    public static void main(String[] args) {
        OperadorDeMaquina op = new OperadorDeMaquina();
        ProgramadorJunior pj = new ProgramadorJunior();
        op.trabalhar();
        op.fazerPausa();

        pj.trabalhar();
        pj.programar();
        pj.fazerPausa();
        System.out.println("----------------");
        System.out.println("Funciona mesmo se criados pelo Pai\n");

        Descansar operador = new OperadorDeMaquina();
        operador.fazerPausa();

        Descansar programador = new ProgramadorJunior();
        programador.fazerPausa();
    }
}
