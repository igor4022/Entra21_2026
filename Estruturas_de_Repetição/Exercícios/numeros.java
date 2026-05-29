package Estruturas_de_Repetição.Exercícios;

public class numeros {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 10; i++) {

            if( i % 2 == 0) {
                System.out.println("PAR:" + i);
            } else if(i != 0) {
                System.out.println("IMPAR:" + i);
            }
            
            soma += i;
        }
        System.out.println("Soma dos valores:" + soma);
    }
}
