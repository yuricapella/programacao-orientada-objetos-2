package Aula_04.Solid_Liskov.Exercicios.Exercicio02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente(100);
        ContaBancaria conta2 = new ContaPoupanca(100);
        conta1.sacar(150);
        conta2.sacar(150);
        System.out.println("Saldo da Conta Corrente: " + conta1.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + conta2.getSaldo());
    }
}
