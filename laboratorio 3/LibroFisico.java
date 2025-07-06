
/**
 * Write a description of class librofisico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LibroFisico {
    private Libro libro; // Composición: contiene un objeto de tipo Libro
    private boolean disponible;     // Atributo propio

    public LibroFisico(String titulo, String autor) {
        this.libro = new Libro(titulo, autor);
        this.disponible = true; // Por defecto, el libro está disponible
    }

    public void prestamo() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolucion() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }
    }

    // Muestra info del libro + si está disponible
    public void mostrarInfo() {
        libro.mostrarInfo(); // Llama al método mostrarInfo del objeto Libro
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
    public boolean estaDisponible() {
    return disponible;
    }
}
