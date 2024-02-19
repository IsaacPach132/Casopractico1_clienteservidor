public class Ebook extends Publicacion {
    private String urlDescarga;
    private String formato; // nuevo campo para el formato

    public Ebook(String titulo, String editorial, int paginas, String urlDescarga, String formato) {
        super(titulo, editorial, paginas, 0.0);
        this.urlDescarga = urlDescarga;
        this.formato = formato; // inicializa el formato
    }

    public Ebook() {
        super("", "", 0,0.0);
        this.urlDescarga = "";
        this.formato = "";
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void reproducir(String titulo, int paginas) {
        System.out.println("Reproduciendo " + titulo + " en formato " + formato);
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Este es un Ebook");
    }

}