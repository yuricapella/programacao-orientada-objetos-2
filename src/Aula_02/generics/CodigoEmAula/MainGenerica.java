package Aula_02.generics.CodigoEmAula;

public class MainGenerica {
    public static void main(String[] args) {
        ClasseGenerica<String> classe = new ClasseGenerica<>();
        classe.setObject("Olá, Generics!");
        System.out.println(classe.getObject());

        ClasseGenerica<Integer> classe2 = new ClasseGenerica<>();
        classe2.setObject(123);
        System.out.println(classe2.getObject());

        System.out.println("--------------------");
        MetodoGenerico.imprimir("Olá, metodo generico");
        MetodoGenerico.imprimir(3);
        MetodoGenerico.imprimir(3.22);
        System.out.println(3.22);
        System.out.println("--------------------");
        System.out.println("Olá, interface generica");
        InterfaceGenerica i1 = new InterfaceGenerica("Yuri");
        InterfaceGenerica i2 = new InterfaceGenerica("Igor");
        System.out.println(i1.compareTo(i2));
        System.out.println("--------------------");
        System.out.println("Key,Value");
        Pair<Integer, String> p1 = new Pair<>(12, "Yuri");


    }
}
