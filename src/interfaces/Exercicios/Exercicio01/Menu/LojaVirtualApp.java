package interfaces.Exercicios.Exercicio01.Menu;

import interfaces.Exercicios.Exercicio01.Clientes.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaVirtualApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        MenuCliente menuCliente = new MenuCliente();
        MenuListarCliente menuListarCliente = new MenuListarCliente();

        System.out.println("Bem vindo a loja virtual");

        boolean executando = true;
        while (executando) {
            String opcao = MenuPrincipal.opcaoInicial(entrada);
            switch (opcao){
                case "1":
                    clientes.add(menuCliente.opcaoUmMenu(entrada));
                    break;
                case "2":
                    menuListarCliente.opcaoDoisMenu(entrada, clientes);
                    break;
                case "3":
                    System.out.println("Encerrando o programa!");
                    executando = false;
            }
        }
        entrada.close();

    }
}
