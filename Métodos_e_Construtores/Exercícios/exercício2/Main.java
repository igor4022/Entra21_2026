package Métodos_e_Construtores.Exercícios.exercício2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Título:");
        String titulo = ler.nextLine();
        System.out.print("Saldo:");
        double saldo  = ler.nextInt();
        ContaBancaria conta = new ContaBancaria(titulo, saldo);

        System.out.println("Valor depositado");
        conta.depositar();
        System.out.println("Consultar Saldo");
        conta.consultarSaldo();
        System.out.print("Valor Sacado");
        conta.sacar();
    }
}
