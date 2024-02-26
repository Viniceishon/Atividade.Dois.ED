public class LivroUm {

    private String titulo;
    private String autor;
    private String tema;

    public LivroUm(String titulo, String autor, String tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;

    }

    public String toString() {
        return "LivroUm{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }
}