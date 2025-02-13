package Aula_02.generics.CodigoEmAula;

public class InterfaceGenerica implements Comparable<InterfaceGenerica>{
    private String nome;

    public InterfaceGenerica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(InterfaceGenerica object) {
        return this.nome.compareTo(object.getNome());
    }


}
