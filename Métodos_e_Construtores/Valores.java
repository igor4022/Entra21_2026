package Métodos_e_Construtores;

public class Valores {
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    public double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
    public double calcularDesconto(double valor, double desconto) {
        return valor - (valor * desconto / 100);
    }
}
