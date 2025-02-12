package interfaces.Exercicios.Exercicio01.Menu;

import interfaces.Exercicios.Exercicio01.Clientes.Cliente;
import interfaces.Exercicios.Exercicio01.Clientes.TipoCliente;

import java.util.Scanner;

public class MenuCliente implements ModeloMenuCliente{

    public Cliente opcaoUmMenu(Scanner entrada) {
        System.out.println("Cadastro de Clientes: ");
        String nomeCliente = obterNomeValido(entrada);
        String emailCliente = obterEmailValido(entrada);
        TipoCliente tipoCliente = obterTipoClienteValido(entrada);
        String documento = obterDocumentoValido(entrada, tipoCliente);

        return new Cliente(nomeCliente, emailCliente, tipoCliente, documento);
    }

    public String obterNomeValido(Scanner entrada) {
        while (true) {
            System.out.println("Digite o nome do cliente: ");
            String nome = entrada.nextLine().trim();
            if (!nome.isEmpty() && nome.length() >= 2 && !nome.matches(".*\\d.*")) {
                return nome;
            }
            System.out.println("Nome inválido! Digite pelo menos 2 letras, sem números.");
        }
    }

    public String obterEmailValido(Scanner entrada) {
        while (true) {
            System.out.println("Digite o email do cliente: (Exemplo: yuri@gmail.com, qlqcoisa@lala.uol)");
            String email = entrada.nextLine().trim();
            if (email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                return email;
            }
            System.out.println("E-mail inválido! Digite um e-mail válido.");
        }
    }

    public TipoCliente obterTipoClienteValido(Scanner entrada) {
        while (true) {
            System.out.println("Digite o tipo de cliente: ");
            System.out.println("1. Pessoa Física");
            System.out.println("2. Pessoa Jurídica");

            if (entrada.hasNextInt()) {
                String opcao = entrada.nextLine().trim();

                switch (opcao) {
                    case "1" -> { return TipoCliente.PESSOA_FISICA; }
                    case "2" -> { return TipoCliente.PESSOA_JURIDICA; }
                    default -> System.out.println("Opção inválida! Digite 1 ou 2.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número.");
            }
        }
    }

    public String obterDocumentoValido(Scanner entrada, TipoCliente tipoCliente) {
        while (true) {
            System.out.printf("Digite o %s: (CPF: 11 digitos, CNPJ: 14 digitos\n", tipoCliente.getIdentificador());
            System.out.println("Exemplo de CPF: 12345678910");
            System.out.println("Exemplo de CNPJ: 12345678910112");
            String documento = entrada.nextLine().trim();

            if (tipoCliente == TipoCliente.PESSOA_FISICA && documento.matches("\\d{11}")) {
                return documento.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
            }
            if (tipoCliente == TipoCliente.PESSOA_JURIDICA && documento.matches("\\d{14}")) {
                return documento.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
            }

            System.out.println("Documento inválido! Digite corretamente.");
        }
    }
}
