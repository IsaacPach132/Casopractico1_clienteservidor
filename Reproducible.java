public interface Reproducible {
    default void reproducir(String titulo, int paginas) {
        System.out.println("Reproduciendo " + titulo);
    }

    default void detener(String titulo) {
        System.out.println("Deteniendo la reproducción de " + titulo);
    }
}