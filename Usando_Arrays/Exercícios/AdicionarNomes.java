package Usando_Arrays.Exercícios;

import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}

public class AdicionarNomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int escolha;
        do {

            System.out.println("""
                    ===== MENU =====
                    Digite 1 para adicionar nomes.
                    Digite 2 para remover nomes.
                    Digite 3 para ver a lista.
                    """);
            System.out.print("Digie a sua escolha...");
            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Adicionar nome: ");
                    String nome = entrada.nextLine();
                    pessoas.add(new Pessoa(nome));
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.print("Remover nome: ");
                    String nomeRemover = entrada.nextLine();
                    for (Pessoa p : pessoas) {
                        if (p.nome.equalsIgnoreCase(nomeRemover)) {
                            pessoas.remove(p);

                        } else {
                            System.out.println("Não encontrado");
                        }
                    }
                    break;
                case 3:
                    for (Pessoa p : pessoas) {
                        System.out.println(p.nome);
                    }
                    break;
                case 4:
                    System.out.print("Fecahndo Progama.....");
                    break;
                default:
                    break;
            }

        } while (escolha != 4);
        entrada.close();
    }
}
