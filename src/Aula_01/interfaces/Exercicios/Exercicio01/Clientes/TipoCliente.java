package Aula_01.interfaces.Exercicios.Exercicio01.Clientes;

public enum TipoCliente {
    PESSOA_FISICA("CPF"),PESSOA_JURIDICA("CNPJ");

    private final String identificador;

    TipoCliente(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }
}
