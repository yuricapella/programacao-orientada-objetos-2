package Aula_04.Solid_Liskov.Exercicios.Exercicio02;

public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
            return;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
