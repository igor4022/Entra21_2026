package Encapsulamento.Exercícios.exercício2;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public void getLivro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void setLivro() {
        System.out.println("===== Livro =====");
        System.out.println("-------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor(a): " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("-------------------------");
    }
}
