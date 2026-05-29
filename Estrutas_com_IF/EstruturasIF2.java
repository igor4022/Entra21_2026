package Estrutas_com_IF;

import java.util.Scanner;

public class EstruturasIF2 {
    public static void main(String[] args) {
        System.out.println("""
                ----- Validador de Idade -----
                """);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade...");
        int idade = entrada.nextInt();

        if(idade >= 18) {
            System.out.print("Você é mair de idade e sua idade é " + idade);
        } else {
            System.out.print("Você é menor de idade e sua idade é " + idade);
        }
    }
}