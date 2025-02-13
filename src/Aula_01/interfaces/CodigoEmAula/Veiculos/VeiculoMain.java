package Aula_01.interfaces.CodigoEmAula.Veiculos;

public class VeiculoMain {
    public static void main(String[] args) {
        Barco barco = new Barco("Barco");
        barco.exibirInformacao();
        barco.mover();
        barco.navegar();

        System.out.println("-----------");

        Aviao aviao = new Aviao();
        aviao.exibirInformacao();
        aviao.mover();
        aviao.voar();
    }
}
