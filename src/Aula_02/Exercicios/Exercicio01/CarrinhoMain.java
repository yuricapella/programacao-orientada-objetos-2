package Aula_02.Exercicios.Exercicio01;

public class CarrinhoMain {
    public static void main(String[] args) {
        System.out.println("Carrinho Strings");
        CarrinhoDeCompra<String> carrinho = new CarrinhoDeCompra<>();
        carrinho.adicionarItem("bola");
        carrinho.adicionarItem("chuteira");
        System.out.println("Carrinho: " + carrinho);

        carrinho.removerItem("chuteira");
        System.out.println("Carrinho: " + carrinho);
        System.out.println("--------------");
        System.out.println("Carrinho Integer");
        CarrinhoDeCompra<Integer> carrinhoInteger = new CarrinhoDeCompra<>();
        carrinhoInteger.adicionarItem(10);
        carrinhoInteger.adicionarItem(20);
        carrinhoInteger.adicionarItem(30);
        System.out.println("Carrinho: " + carrinhoInteger);
        carrinhoInteger.removerItem(10);
        System.out.println("Carrinho: " + carrinhoInteger);




    }
}
