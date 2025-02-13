package Aula_01.interfaces.Veiculos;

public abstract class Veiculo {
    private String nome = "Barco";
    String cor = "Azul";

    public Veiculo() {

    }
    abstract void mover();

    public void exibirInformacao() {
        System.out.println("Veiculo: " + nome);
    }
}
