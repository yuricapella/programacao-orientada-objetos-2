package Aula_01.Interfaces.Exercicios.Exercicio01.Clientes;

public class Cliente implements ModeloCliente {
    private String nome;
    private String email;
    private final String DOCUMENTO;
    private final TipoCliente TIPO_CLIENTE;
    private static long contadorCliente = 1;
    private final long idCliente;

    public Cliente(String nome, String email, TipoCliente tipo, String documento) {
        this.idCliente = contadorCliente++;
        this.nome = nome;
        this.email = email;
        this.DOCUMENTO = documento;
        this.TIPO_CLIENTE = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return DOCUMENTO;
    }

    public TipoCliente getIdentificador() {
        return TIPO_CLIENTE;
    }

    public long getIdCliente() {
        return this.idCliente;
    }


    @Override
    public String toString() {
        return String.format(
                """
                    Nome: %s
                    Email: %s
                    Documento: %s
                    Identificador: %s
                    Id Cliente: %d
                """,
                nome, email, DOCUMENTO, TIPO_CLIENTE, idCliente
        ).indent(4);
    }
}
