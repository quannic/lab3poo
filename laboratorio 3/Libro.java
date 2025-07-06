
/**
 * Write a description of class libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
