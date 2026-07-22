package Métodos_e_Construtores.Exercícios.exercício;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    void aumentarSalario(double precentual) {
        salario += salario * precentual/100;
    }
    void apresentar() {
        System.out.println(nome);
        System.out.println(salario);
    }
}
