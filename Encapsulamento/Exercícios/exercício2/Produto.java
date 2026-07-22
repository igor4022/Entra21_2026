package Encapsulamento.Exercícios.exercício2;

public class Produto {
    private String nome;
    private double preco;

    public void getProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setMostrar() {
        System.out.println("===== Produto =====");
        System.out.println("-------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + preco);
        System.out.println("-------------------------");
    }
}
