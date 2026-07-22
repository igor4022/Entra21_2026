package Métodos_e_Construtores.Desafio;

public class Alunos {
    String nome;
    int idade;
    String curso;

    public Alunos(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    public void apresentar(int nota1, int nota2) {
        System.out.println("O nome do aluno é " + nome);
        System.out.println("Seu curso é o curso de " + curso);
        System.out.println("Suas duas notas são " + nota1 + " e " + nota2);
    }
    public void calcularMedia(int nota1,int nota2) {
        double resultado = (nota1 + nota2) / 2;
        System.out.println(resultado);
    }
    public void situacao(int nota1, int nota2) {
        double resultado = (nota1 + nota2) / 2;
        if(resultado >= 7) {
            System.out.println("APROVADO");
        } else if(resultado >= 5 && resultado < 7) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
