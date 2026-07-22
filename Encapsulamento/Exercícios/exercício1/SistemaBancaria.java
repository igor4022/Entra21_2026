package Encapsulamento.Exercícios.exercício1;

public class SistemaBancaria {
    private double saldo;
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Seu deposito é inválido");
        }
    }
    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Seu saldo está vazio");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}
