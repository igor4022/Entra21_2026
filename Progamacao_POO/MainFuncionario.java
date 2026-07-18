package Progamacao_POO;

public class MainFuncionario {
    public static void main(String[] args) {
        funcionario f1 = new funcionario();
        f1.nome = "Igor";
        f1.cargo = "Professor";
        f1.salario = 3500;
        System.out.println("======== FUNCIONÁRIO 1 ========");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Cargo: " + f1.cargo);
        System.out.println("Salário: R$ " + f1.salario);
    }
}