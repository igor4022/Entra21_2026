import java.util.Scanner;

public class VericadoDeDivisao {
    public static void main(String[] args) {
        System.out.println("""
                ----- Verica se o resto da sua divisão é mair que 100 -----
                """);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um valor...");
        double a = entrada.nextDouble();
        System.out.println("Escolha um ultimo valor...");
        double b = entrada.nextDouble();
        double valores = a / b;
        if(valores > 100) {
            System.out.println("Esse valor é maior que 100");
            System.out.println("O seu valor é " + valores);
        } else {
            System.out.println("Esse valor é menor que 100");
            System.out.println("O seu valor é " + valores);
        }
    }
}
