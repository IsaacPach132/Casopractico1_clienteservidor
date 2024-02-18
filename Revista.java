public class Revista extends Publicacion {

    public Revista(String titulo, String editorial, int paginas, int numero) {
        super(titulo, editorial, paginas, 0.0);
    }

    public Revista() {
        super("", "", 0, 0.0);
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Tipo de publicación: Revista");
    }
}