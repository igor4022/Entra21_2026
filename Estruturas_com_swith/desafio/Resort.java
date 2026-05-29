package Estruturas_com_swith.desafio;

import java.util.Scanner;

public class Resort {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                ----- LOGIN de ENTRADA -----
                """);
        System.out.print("Digite sua idade...");
        int idade = entrada.nextInt();
        System.out.print("Qual a quantidade de dias você pretende ficar...");
        double diaria = entrada.nextInt();

        int categoria = 0;
        String clasifica = "";
        double valorDiaria = 0;
        double valorTotal = 0;
        String situacao = "";

        if (idade >= 0 && idade <= 10) {
            categoria = 1;
            valorDiaria = 500.12;
        }

        if (idade >= 11 && idade <= 59) {
            categoria = 2;
            valorDiaria = 1000.14;
        }

        if (idade >= 60) {
            categoria = 3;
            valorDiaria = 700.25;
        }

        switch (categoria) {
            case 1:
                clasifica = " criança";                
                break;
            case 2:
                clasifica = " adulto(a)";               
                break;
            case 3:
                clasifica = " idoso(a)";               
                break;
            default:
                clasifica = "Categoria descomhecida ";
        }

        valorTotal = valorDiaria * diaria;

        System.out.println("Você é uma " + clasifica);
        entrada.close();
        System.out.println("O valor da diária é R$" + valorTotal);

        if (valorTotal >= 3000) {
            situacao = "Você é um cliente fiel";
            System.out.print(situacao);
        } else {
            situacao = "Você não é um cliente fiel";
            System.out.print(situacao);
        }

    }

}
