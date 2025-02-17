package Aula_02.Generics.Exercicios.Exercicio01_parte01;

public class CarrinhoMain {
    public static void main(String[] args) {
        System.out.println("Carrinho Strings");
        CarrinhoDeCompra<String> carrinho = new CarrinhoDeCompra<>();
        carrinho.adicionarItem("bola");
        carrinho.adicionarItem("chuteira");
        carrinho.adicionarItem("cadeira");
        carrinho.adicionarItem("controle");
        System.out.println("Carrinho: " + carrinho);
        System.out.println("Quantidade total de itens: " + carrinho.getQuantidadeTotal());

        System.out.println();

        System.out.println("Removendo chuteira");
        carrinho.removerItem("chuteira");

        System.out.println("Carrinho: " + carrinho);
        System.out.println("Quantidade total de itens: " + carrinho.getQuantidadeTotal());

        System.out.println("--------------");
        System.out.println("Carrinho Integer");
        CarrinhoDeCompra<Integer> carrinhoInteger = new CarrinhoDeCompra<>();

        carrinhoInteger.adicionarItem(10);
        carrinhoInteger.adicionarItem(20);
        carrinhoInteger.adicionarItem(30);
        System.out.println("Carrinho: " + carrinhoInteger);
        System.out.println("Quantidade total de itens: " + carrinhoInteger.getQuantidadeTotal());

        System.out.println();

        System.out.println("Removendo 10");
        carrinhoInteger.removerItem(10);

        System.out.println("Carrinho: " + carrinhoInteger);
        System.out.println("Quantidade total de itens: " + carrinhoInteger.getQuantidadeTotal());




    }
}
