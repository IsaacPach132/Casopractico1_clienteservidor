public abstract class Publicacion {
    protected String titulo;
    protected String editorial;
    protected int paginas;
    protected double precio;

    public Publicacion(String titulo, String editorial, int paginas, double precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.paginas = paginas;
        this.precio = precio;
    }

    public abstract void imprimirTipo();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}