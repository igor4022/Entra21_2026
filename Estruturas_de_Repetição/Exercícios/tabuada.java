package Estruturas_de_Repetição.Exercícios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        System.out.println("""
                ----- GERADOR DE TABUADA -----
                """);
        System.out.print("Escolha um número para gerar a tabuada...");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if( numero < 0) {
            System.out.println("O número escolhido foi um número negativo");
        }
        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
