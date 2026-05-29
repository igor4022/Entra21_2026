package Usando_Arrays.Exercícios;

import java.util.Scanner;

public class SalvaValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        int impar = 0;
        int par = 0;
        int total = 0;
        System.out.println("""
                ===== Somador de Ímpares e Pares =====
                """);
        for(int i : numeros) {
            System.out.print("Digíte os número...");
            int valor = entrada.nextInt();
            total += valor;
            if(valor % 2 == 0) {
                par += valor;
            } else {
                impar += valor;
            }
        }
        System.out.println("Números pares somados " + par);
        System.out.println("Números ímpares somados " + impar);
        System.out.println("Números ímpares e pares somados " + total);
    }
}
