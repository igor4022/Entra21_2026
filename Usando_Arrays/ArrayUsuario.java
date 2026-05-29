package Usando_Arrays;

import java.util.Scanner;

public class ArrayUsuario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        // Entrada de dados
        // for (int i = 0; i < numeros.length; i++) {
        for (int i : numeros) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }


        // Exibindo os números
        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
