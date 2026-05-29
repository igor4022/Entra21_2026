import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual sua idade...");
        int idade = entrada.nextInt();

        if(idade >= 0 && idade <= 12) {
            System.out.print("Você é uma criança");
        } else if(idade >= 12 && idade <= 17) {
            System.out.print("Você é um adolescente");
        } else if(idade >= 18 && idade <= 59) {
            System.out.print("Você é um adulto");
        } else if(idade < 0) {
            System.out.print("Você não colocou uma idade valida");
        } else {
            System.out.print("Você é um idose");
        }
    }
}