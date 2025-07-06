/*
 * @Joel Seura 21.556.232-8 
 */
public class Usuario {
    private String nombre;
    private int idUsuario;
    private LibroFisico libroPrestado; // Puede ser null si no tiene libro

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.libroPrestado = null; // Inicialmente no tiene libro prestado
    }

    public void pedirPrestado(LibroFisico libro) {
        if (libroPrestado != null) {
            System.out.println("Ya tienes un libro prestado.");
        } else if (!libro.estaDisponible()) {
            System.out.println("El libro no está disponible.");
        } else {
            libro.prestamo(); // Marcar como no disponible
            libroPrestado = libro;
            System.out.println("Libro prestado exitosamente.");
        }
    }

    public void devolverLibro() {
        if (libroPrestado != null) {
            libroPrestado.devolucion(); // Marcar como disponible
            libroPrestado = null;
            System.out.println("Libro devuelto correctamente.");
        } else {
            System.out.println("No tienes ningún libro para devolver.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID de Usuario: " + idUsuario);
        if (libroPrestado != null) {
            System.out.println("Libro prestado:");
            libroPrestado.mostrarInfo();
        } else {
            System.out.println("No tiene libros prestados actualmente.");
        }
    }
}

