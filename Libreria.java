import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Publicacion> inventario;

    public Libreria() {
        this.inventario = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        inventario.add(publicacion);
    }

    public static void prestarPublicacion(Publicacion publicacion) {
        if (publicacion instanceof Libro) {
            Libro libro = (Libro) publicacion;
            if (libro.getPrecio() < 200) {
                System.out.println("Prestar el libro por 15 días.");
            } else {
                System.out.println("Prestar el libro por 3 días.");
            }
        } else if (publicacion instanceof Revista) {
            System.out.println("Prestar la revista por 5 días.");
        } else if (publicacion instanceof Ebook) {
            Ebook ebook = (Ebook) publicacion;
            System.out.println("El ebook no se presta, pero puedes descargarlo desde: " + ebook.getUrlDescarga());
        } else {
            System.out.println("Tipo de publicación no compatible para préstamo.");
        }
    }

    public static double devolverPublicacion(Publicacion publicacion, int diasRetraso) {
        double costoRetraso = 0;
        if (publicacion instanceof Libro) {
            costoRetraso = diasRetraso * 2;
        } else if (publicacion instanceof Revista) {
            costoRetraso = diasRetraso * 1.5;
        } else {
            System.out.println("No se puede calcular el costo de retraso para esta publicación.");
        }
        return costoRetraso;
    }
}