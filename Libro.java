public class Libro extends Publicacion {
    private String autor;

    public Libro(String titulo, String editorial, int paginas, double precio) {
        super(titulo, editorial, paginas, precio);
        this.autor = "";
    }

    public Libro() {
        super("", "", 0, 0.0);
        this.autor = "";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Este es un libro.");
    }
}