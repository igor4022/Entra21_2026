package Encapsulamento.Exercícios.exercício1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        SistemaBancaria banco = new SistemaBancaria();
        int resposta;

        do {
            System.out.println("""
                    ===== Banco =====
                    0- Para Saír.
                    1- Para Depositar.
                    2- Para Sacar.
                    3- Ver Saldo.
                    """);
            System.out.print("Dígite:");
            resposta = ler.nextInt();
            switch (resposta) {
                case 0:
                    System.out.println("Saíndo do Sistema...");
                    break;
                case 1:
                    System.out.print("Deposite o valor:");
                    double deposirar = ler.nextDouble();
                    banco.depositar(deposirar);
                    break;
                case 2:
                    System.out.print("Sacar Valor:");
                    double sacar = ler.nextDouble();
                    banco.sacar(sacar);
                    break;
                case 3:
                    System.out.println("===== Saldo =====");
                    System.out.println("Saldo: R$" + banco.getSaldo());
                    break;
                default:
                    System.out.print("ERRO! O valor escolhido não existe");
                    break;
            }

        } while(resposta != 0);
    }
}
