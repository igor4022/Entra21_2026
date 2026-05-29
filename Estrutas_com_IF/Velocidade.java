package Estrutas_com_IF;

public class Velocidade {
    public static void main(String[] args) {
        double automvel1 = 85;
        double automovel2 = 110;
        double automovel3 = 115;
        double resultado = (automvel1 + automovel2 + automovel3) / 3;

        if( resultado >= 100) {
            System.out.print("Sua vlocidade está acima do permitido");
        } else {
            System.out.print("Sua velocidade está no limite");
        }
    }
}
