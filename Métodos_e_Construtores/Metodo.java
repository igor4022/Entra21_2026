package Métodos_e_Construtores;
public class Metodo {
    public static void main(String[] args){
        MetodoPessoa p = new MetodoPessoa();
        MetodoPessoa p1 = new MetodoPessoa();
        p.nome = "Igor";
        p.apresentar();
        p1.apresentar();
    }
}