/*
 * @Joel Seura 21.556.232-8 
 */
public class Main {
    public static void main(String[] args) {
  
        LibroFisico libro1 = new LibroFisico("1984", "George Orwell");
        LibroFisico libro2 = new LibroFisico("Fahrenheit 451", "Ray Bradbury");

   
        Usuario usuario = new Usuario("Carlos Pérez", 1);


        System.out.println("=== Estado inicial del usuario ===");
        usuario.mostrarInfo();

        
        System.out.println("\n=== Carlos intenta pedir prestado '1984' ===");
        usuario.pedirPrestado(libro1);

        System.out.println("\n=== Estado después del préstamo ===");
        usuario.mostrarInfo();

        
        System.out.println("\n=== Carlos intenta pedir prestado 'Fahrenheit 451' sin devolver ===");
        usuario.pedirPrestado(libro2);

        System.out.println("\n=== Carlos devuelve el libro ===");
        usuario.devolverLibro();

        System.out.println("\n=== Estado final del usuario ===");
        usuario.mostrarInfo();

        System.out.println("\n=== Carlos pide ahora 'Fahrenheit 451' ===");
        usuario.pedirPrestado(libro2);

        
        System.out.println("\n=== Estado después de pedir el segundo libro ===");
        usuario.mostrarInfo();
    }
}
