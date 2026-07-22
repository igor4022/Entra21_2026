package Métodos_e_Construtores.Exercícios.exercício2;

public class ContaBancaria {
    String titulo;
    double saldo;

    public ContaBancaria(String titulo, double saldo) {
        this.titulo = titulo;
        this.saldo = saldo;
    }
    void depositar() {
        System.out.println(titulo);
        System.out.println(saldo);
    }
    void consultarSaldo() {
        System.out.println(saldo);
    }
    void sacar() {
        System.out.println(saldo);
    }
}
