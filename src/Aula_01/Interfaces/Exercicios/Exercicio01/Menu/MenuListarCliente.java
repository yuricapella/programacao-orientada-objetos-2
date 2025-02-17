package Aula_01.Interfaces.Exercicios.Exercicio01.Menu;

import Aula_01.Interfaces.Exercicios.Exercicio01.Clientes.Cliente;
import Aula_01.Interfaces.Exercicios.Exercicio01.Clientes.TipoCliente;

import java.util.List;
import java.util.Scanner;

public class MenuListarCliente {
    public void opcaoDoisMenu(Scanner entrada,List<Cliente> clientes){
        boolean continuarListando = true;

        while (continuarListando) {
            System.out.println("1. Listar todos os Clientes");
            System.out.println("2. Listar Pessoa Física");
            System.out.println("3. Listar Pessoa Jurídica");
            System.out.println("4. Sair");
            String segundaEscolha = entrada.nextLine();

            switch (segundaEscolha) {
                case "1":
                    listarClientes(clientes);
                    break;
                case "2":
                    listarClientesPorTipo(clientes, TipoCliente.PESSOA_FISICA);
                    break;
                case "3":
                    listarClientesPorTipo(clientes, TipoCliente.PESSOA_JURIDICA);
                    break;
                case "4":
                    System.out.println("Saindo da listagem...");
                    continuarListando = false; // Encerra o loop e sai
                    break;
                default:
                    System.out.println("Opção inválida! Digite 1, 2, 3 ou 4.");
                    break;
            }
        }
    }

    private void listarClientes(List<Cliente> clientes) {
        System.out.println("Lista de Todos os Clientes: ");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private void listarClientesPorTipo(List<Cliente> clientes, TipoCliente tipoCliente) {
        System.out.printf("Lista de %s: \n", tipoCliente);
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificador() == tipoCliente) {
                System.out.println(cliente);
            }
        }
    }
}
