package Aula_05.Solid_ID.Exercicios.Exercicio_02.Funcionarios;

import Aula_05.Solid_ID.Exercicios.Exercicio_02.Interfaces.Descansar;
import Aula_05.Solid_ID.Exercicios.Exercicio_02.Interfaces.Programador;
import Aula_05.Solid_ID.Exercicios.Exercicio_02.Interfaces.Trabalhador;

public class ProgramadorJunior implements Programador, Trabalhador, Descansar {
    @Override
    public void programar() {
        System.out.println("Programador Junior está programando...");
    }

    @Override
    public void trabalhar() {
        System.out.println("Programador Junior está trabalhando...");
    }

    @Override
    public void fazerPausa() {
        System.out.println("Programador Junior está fazendo uma pausa...");
    }
}
