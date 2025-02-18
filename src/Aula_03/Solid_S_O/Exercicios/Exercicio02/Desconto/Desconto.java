package Aula_03.Solid_S_O.Exercicios.Exercicio02.Desconto;

import Aula_03.Solid_S_O.Exercicios.Exercicio02.Pagamento.Pagamento;

public abstract class Desconto {
    public double valorDesconto;

    public Desconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double aplicarDesconto() {
        return Pagamento.calcularTotal() * valorDesconto;
    }
}
