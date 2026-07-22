package Métodos_e_Construtores;

import java.util.Scanner;

public class MetodoCalculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int resposta;
        do {
            System.out.println("""
                        Calculadora
                        1- Para calcular.
                        2- Para sair.
                        """);
            resposta = ler.nextInt();
                switch(resposta) {
                    case 1: 
                        Calculadora calc = new Calculadora();
                        System.out.print("Digpite um número:");
                        double num1 = ler.nextInt();
                        System.out.print("Digíte mais um número:");   
                        double num2 = ler.nextInt();

                        System.out.println("Soma: " + calc.somar(num1, num2));
                        System.out.println("Subtração: " + calc.subtrair(num1, num2));
                        System.out.println("Divisão: " + calc.dividir(num1, num2));
                        break;
                    case 2:
                        System.out.println("Saindo do programa...");
                    default:
                        break;
                }
        } while(resposta != 2);
        
    }
}