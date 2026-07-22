package Encapsulamento.Desafio;

import java.util.Scanner;

public class PrincipalProd2 {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Scanner ler = new Scanner(System.in);
        System.out.println("""
                === Adicionar Produto =====
                """);
        Produto2 produto = new Produto2();
        System.out.print("Nome:");
        String  nome = ler.nextLine();
        System.out.print("Preço:");
        double preco = ler.nextDouble();
        // Utilizando os setters
        produto.setNome(nome);
        produto.setPreco(preco);
        // Exibindo os dados utilizando os getters
        System.out.println("===== LOJA =====");
        System.out.println("-------------------------");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("-------------------------");
    }
}
