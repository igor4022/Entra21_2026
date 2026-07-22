package Métodos_e_Construtores.Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("""
                ===== Sistema de Notas =====
                """);
        System.out.print("Coloque seu nome:");
        String nome = ler.nextLine();
        System.out.print("Digíte sua idade:");
        int idade = ler.nextInt();
        ler.nextLine();
        System.out.print("Coloque seu curso:");
        String curso = ler.nextLine();
        System.out.print("Primeira Nota:");
        int nota1 = ler.nextInt();
        System.out.print("Segunda Nota:");
        int nota2 = ler.nextInt();
        Alunos alunos = new Alunos(nome, idade, curso);
        
        System.out.println("===== Resultados =====");
        System.out.println("Apresentação:");
        alunos.apresentar(nota1, nota2);
        System.out.println("Média gerral:");
        alunos.calcularMedia(nota1, nota2);
        System.out.println("Sua situação:");
        alunos.situacao(nota1, nota2);
    }
}
