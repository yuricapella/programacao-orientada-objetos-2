package interfaces.Exercicios.Exercicio01.Menu;

import interfaces.Exercicios.Exercicio01.Clientes.Cliente;
import interfaces.Exercicios.Exercicio01.Clientes.TipoCliente;

import java.util.Scanner;

public interface ModeloMenuCliente {
    Cliente opcaoUmMenu(Scanner entrada);

    String obterNomeValido(Scanner entrada);

    String obterEmailValido(Scanner entrada);

    TipoCliente obterTipoClienteValido(Scanner entrada);

    String obterDocumentoValido(Scanner entrada, TipoCliente tipoCliente);
}
