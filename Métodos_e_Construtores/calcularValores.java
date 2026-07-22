package Métodos_e_Construtores;

import java.util.Scanner;

public class calcularValores {
    public static void main(String[] args) {
        Valores val = new Valores();
        Scanner ler = new Scanner(System.in);
        System.out.print("Digíte o primeiro valor:");
        double num1 = ler.nextInt();
        System.out.print("Digite o segundo valor:");
        double num2 = ler.nextInt();
        
        System.out.println("Area: " + val.calcularArea(num1, num2));
        System.out.println("Perimetro " + val.calcularPerimetro(num1, num2));
        System.out.println("Valor Final com desconto: R$" + val.calcularDesconto(num1, num2));
    }
}
