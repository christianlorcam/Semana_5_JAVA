import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Crear el Set para usuarios
        Set<String> usuarios = new HashSet<>();

        // Paso 2: Preguntar cuántos registrar
        System.out.print("¿Cuántos usuarios deseas registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        // Paso 3 y 4: Solicitar nombre e intentar agregarlo
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre de usuario " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            
            // El método .add() en un Set devuelve 'true' si se agregó con éxito, 
            // y 'false' si el elemento ya existía.
            boolean seAgrego = usuarios.add(nombre);

            // Paso 5: Si el usuario ya existe, avisar
            if (!seAgrego) {
                System.out.println("Usuario repetido. No se agregó a la lista.");
            }
        }

        // Paso 6: Mostrar todos los usuarios únicos
        System.out.println("\n--- Usuarios Únicos Registrados ---");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }

        // Paso 7: Mostrar cuántos existen
        System.out.println("Total de usuarios únicos: " + usuarios.size());
        
        scanner.close();
    }
}