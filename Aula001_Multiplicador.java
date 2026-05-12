import java.util.Scanner;

public class Aula001_Multiplicador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                -----CONTADOR DE MÉDIA-----
        Escolha tres valores e descubra a média entre eles
                """);
        System.out.print("Escolha um número...");
        int a = entrada.nextInt();
        System.out.print("Escolha outro número...");
        int b = entrada.nextInt();
        System.out.print("Escolha um ultímo número...");
        int c = entrada.nextInt();
        int valores = a + b + c;

        System.out.println("Resultado da média geral: " + valores / 3);
    }
}