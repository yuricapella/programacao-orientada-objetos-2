package Aula_05.Solid_ID.Exercicios.Exercicio_02.Funcionarios;

import Aula_05.Solid_ID.Exercicios.Exercicio_02.Interfaces.Descansar;
import Aula_05.Solid_ID.Exercicios.Exercicio_02.Interfaces.Trabalhador;

public class OperadorDeMaquina implements Trabalhador, Descansar {
    @Override
    public void trabalhar() {
        System.out.println("Operador está trabalhando..." );
    }

    @Override
    public void fazerPausa() {
        System.out.println("Operador está fazendo uma pausa..." );
    }
}
