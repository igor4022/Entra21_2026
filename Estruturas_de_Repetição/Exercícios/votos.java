package Estruturas_de_Repetição.Exercícios;

import java.util.Scanner;

public class votos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto;
        int sim = 0;
        int nao = 0;
        int abstencao = 0;

        System.out.println("=== Sistema de Votação ===");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("3 - Abstenção");
        System.out.println("0 - Encerrar votação");

        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    sim++;
                    break;
                case 2:
                    nao++;
                    break;
                case 3:
                    abstencao++;
                    break;
                case 0:
                    System.out.println("Votação encerrada.");
                    break;
                default:
                    System.out.println("Voto inválido!");
            }

        } while (voto != 0);

        int total = sim + nao + abstencao;

        System.out.println("\n=== Resultado ===");
        System.out.println("Sim: " + sim);
        System.out.println("Não: " + nao);
        System.out.println("Abstenção: " + abstencao);
        System.out.println("Total de votos: " + total);

        if (sim > nao) {
            System.out.println("Resultado: Aprovado!");
        } else if (nao > sim) {
            System.out.println("Resultado: Rejeitado!");
        } else {
            System.out.println("Resultado: Empate!");
        }

        scanner.close();
    }
}
