package src.interfaces.Veiculos;

public class Barco extends Veiculo implements Navegavel{
    private String nome = "Barco";

    public Barco(String nome) {
        super();
    }

    @Override
    void mover() {
        System.out.println(nome + " está se movendo!");
    }
    @Override
    public void navegar(){
        System.out.println("Este veiculo está navegando");
    }

}
