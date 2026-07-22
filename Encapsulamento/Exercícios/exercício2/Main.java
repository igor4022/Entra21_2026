package Encapsulamento.Exercícios.exercício2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto = new Produto();
        Livro livro = new Livro();
        Aluno aluno = new Aluno();

        int resposta;
        do {
            System.out.println("""
                    1- Adicionar Produto
                    2- Adicionar Livro
                    3- Adicionar Aluno
                    """);
            System.out.print("Digite:");
            resposta = ler.nextInt();
            ler.nextLine();
            switch (resposta) {
                case 0:
                    System.out.println("Saíndo do Sistema...");
                    break;
                case 1:
                    System.out.print("Nome:");
                    String nome = ler.nextLine();
                    System.out.print("Salário:");
                    double preso = ler.nextDouble();
                    produto.getProduto(nome, preso);
                    produto.setMostrar();
                    break;
                case 2:
                    System.out.print("Título:");
                    String titulo = ler.nextLine();
                    System.out.print("Autor:");
                    String autor = ler.nextLine();
                    System.out.print("Paginas:");
                    int paginas = ler.nextInt();
                    livro.getLivro(titulo, autor, paginas);
                    livro.setLivro();
                    break;
                case 3:
                    System.out.print("Aluno:");
                    String nomeALuno = ler.nextLine();
                    System.out.print("Nota:");
                    double nota = ler.nextDouble();
                    aluno.getAluno(nomeALuno, nota);
                    aluno.setAluno();
                    break;
                default:
                    System.out.println("ERRO! A opção escolhida não existe");
                    break;
            }
        } while(resposta != 0);
    }
}
