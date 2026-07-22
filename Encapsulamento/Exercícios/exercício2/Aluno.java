package Encapsulamento.Exercícios.exercício2;

public class Aluno {
    private String nome;
    private double nota;

    public void getAluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public void setAluno() {
        System.out.println("===== Aluno =====");
        System.out.println("-------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("-------------------------");
    }
}
