package Aula_01.Interfaces.CodigoEmAula.Veiculos;

/*
Colocando o metodo default, conseguimos declarar o metodo, se tira-lo dará erro.
 */
public interface Navegavel {

    default void navegar(){
        System.out.println("Navegando");
    }
}
