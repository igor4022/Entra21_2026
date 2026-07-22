package Métodos_e_Construtores;

public class Calculadora {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    public double subtrair(double num1, double num2) {
        return num1 * num2;
    }
    public double dividir(double num1, double num2) {
        if(num2 == 0 || num1 == 0) {
            System.out.println("O número não pode ser dividido por zero");
            return 0;
        }
        return num1 / num2;
    }
}
