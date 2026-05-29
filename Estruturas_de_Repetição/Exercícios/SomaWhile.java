package Estruturas_de_Repetição.Exercícios;

import java.util.Scanner;

public class SomaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int valor;

        System.out.println("""
                    ===== SOMADOR de NÚMEROS =====
                    """);
        do {
            System.out.print("Escolha um número para somar...");
            valor = entrada.nextInt();
            soma += valor;
            System.out.println("Soma de 1 a 100: " + soma);
        } while (valor != 0);

        System.out.println("Soma total final: " + soma);

        entrada.close();
    }
}
