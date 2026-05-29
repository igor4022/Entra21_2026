import java.util.ArrayList;
public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}