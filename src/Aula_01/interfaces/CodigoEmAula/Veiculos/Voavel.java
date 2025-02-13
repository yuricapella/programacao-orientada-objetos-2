package Aula_01.interfaces.CodigoEmAula.Veiculos;

public interface Voavel {
    default void voar(){
        System.out.println("Este veiculo está voando");
    }
}
