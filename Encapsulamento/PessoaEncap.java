package Encapsulamento;

public class PessoaEncap {
    private String nome;
    public double idade;
    public String getNome() {
        return nome;
    }
    public double getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(double idade) {
        this.idade = idade;
    }
}
