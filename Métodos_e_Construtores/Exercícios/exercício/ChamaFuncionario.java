package Métodos_e_Construtores.Exercícios.exercício;

public class ChamaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Igor", 5000.00);
        System.out.println("Dados do funcionario");
        func.apresentar();
        System.out.println("Com aumento de 10%");
        func.aumentarSalario(10);
        func.apresentar();
    }
}
