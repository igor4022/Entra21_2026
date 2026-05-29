package Text;

import java.util.Scanner;

public class TextFalse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int valores = a + b + c;

        System.out.print(valores / 3);
    }
}
