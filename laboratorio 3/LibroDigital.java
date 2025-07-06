
/**
 * Write a description of class librodigital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LibroDigital {
    private Libro libro;               // Composición: contiene un Libro
    private double tamañoMB;
    private String enlaceDescarga;

    public LibroDigital(String titulo, String autor, double tamañoMB, String enlaceDescarga) {
        this.libro = new Libro(titulo, autor); // Se crea un objeto Libro internamente
        this.tamañoMB = tamañoMB;
        this.enlaceDescarga = enlaceDescarga;
    }

    public void mostrarInfo() {
        libro.mostrarInfo(); // Muestra título y autor desde la clase Libro
        System.out.println("Tamaño del archivo: " + tamañoMB + " MB");
        System.out.println("Enlace de descarga: " + enlaceDescarga);
    }
}

