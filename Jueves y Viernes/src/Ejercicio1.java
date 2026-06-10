import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Crear la lista para almacenar textos (String)
        List<String> productos = new ArrayList<>();

        // Paso 2: Preguntar cuántos productos registrar
        System.out.print("¿Cuántos productos deseas registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea que deja nextInt()

        // Paso 3: Solicitar cada producto y agregarlo
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el producto " + (i + 1) + ": ");
            String producto = scanner.nextLine();
            productos.add(producto); // Aquí lo guardamos en la lista
        }

        // Paso 4: Mostrar todos los productos registrados
        System.out.println("\n--- Lista de Productos ---");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        // Paso 5: Mostrar cuántos productos fueron ingresados
        System.out.println("Total de productos ingresados: " + productos.size());
        
        scanner.close();
    }
}