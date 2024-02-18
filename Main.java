public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("El principito", "Salamandra", 100, 150);
        Revista revista = new Revista("National Geographic", "National Geographic Society", 50, 10);
        Ebook ebook = new Ebook("Introducción a la programación", "TechBooks", 200, "PDF", "http://www.example.com");

        ebook.reproducir(ebook.getTitulo(), ebook.getPaginas());

        Libreria.prestarPublicacion(libro);
        Libreria.prestarPublicacion(revista);
        Libreria.prestarPublicacion(ebook);

        double costoLibro = Libreria.devolverPublicacion(libro, 5);
        System.out.println("El costo de retraso para el libro es: " + costoLibro);

        double costoRevista = Libreria.devolverPublicacion(revista, 2);
        System.out.println("El costo de retraso para la revista es: " + costoRevista);

        try {
            double costoEbook = Libreria.devolverPublicacion(ebook, 3);
            System.out.println("El costo de retraso para el ebook es: " + costoEbook);
        } catch (UnsupportedOperationException e) {
            System.out.println("El ebook no se devuelve, no hay costo de retraso.");
        }
    }
}