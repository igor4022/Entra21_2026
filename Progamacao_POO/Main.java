package Progamacao_POO;

public class Main {
        public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3500;
        p1.quantidade = 8;
        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 90;
        p2.quantidade = 25;
        System.out.println("======== PRODUTO 1 ========");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Preço: R$ " + p1.preco);
        System.out.println("Quantidade: " + p1.quantidade);
        System.out.println();
        System.out.println("======== PRODUTO 2 ========");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Preço: R$ " + p2.preco);
        System.out.println("Quantidade: " + p2.quantidade);
    }
}                                    