package Aula_01.Interfaces.Exercicios.Exercicio01.Menu;

import Aula_01.Interfaces.Exercicios.Exercicio01.Clientes.Cliente;
import Aula_01.Interfaces.Exercicios.Exercicio01.Clientes.TipoCliente;

import java.util.Scanner;

public interface ModeloMenuCliente {
    Cliente opcaoUmMenu(Scanner entrada);

    String obterNomeValido(Scanner entrada);

    String obterEmailValido(Scanner entrada);

    TipoCliente obterTipoClienteValido(Scanner entrada);

    String obterDocumentoValido(Scanner entrada, TipoCliente tipoCliente);
}
