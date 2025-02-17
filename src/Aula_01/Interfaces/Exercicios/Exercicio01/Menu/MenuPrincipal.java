package Aula_01.Interfaces.Exercicios.Exercicio01.Menu;

import java.util.Scanner;

public class MenuPrincipal {
    public static String opcaoInicial(Scanner entrada) {
        System.out.println("Menu Principal");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Sair do programa");
        String opcao = entrada.nextLine();
        return opcao;
    }
}
