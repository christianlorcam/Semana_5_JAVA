import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFrutas {

    // 1. EL MAIN (El jefe que coordina a los mini-robots)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> frutas = new ArrayList<>(); // Nuestra lista vacía

        System.out.println("--- 1. AGREGAR FRUTAS ---");
        agregarFrutas(frutas, sc);

        System.out.println("\n--- 2. MOSTRAR FRUTAS ---");
        mostrarFrutas(frutas);

        System.out.println("\n--- 3. MOSTRAR CANTIDAD ---");
        mostrarCantidad(frutas);

        System.out.println("\n--- 4. REEMPLAZAR UNA FRUTA ---");
        reemplazarFruta(frutas, sc);

        System.out.println("\n--- 5. ELIMINAR UNA FRUTA ---");
        eliminarFruta(frutas, sc);

        System.out.println("\n--- 6. RESULTADO FINAL ---");
        mostrarFrutas(frutas);

        // NUNCA OLVIDAR: Cerrar el scanner al final del programa
        sc.close(); 
    }

    // --- A PARTIR DE AQUÍ CREAMOS NUESTRAS FUNCIONES (MINI-ROBOTS) ---

    // Función para agregar
    static void agregarFrutas(List<String> frutas, Scanner sc) {
        System.out.print("¿Cuántas frutas deseas ingresar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpiar el "Enter" fantasma

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la fruta " + (i + 1) + ": ");
            String nuevaFruta = sc.nextLine();
            frutas.add(nuevaFruta);
        }
    }

    // Función para mostrar
    static void mostrarFrutas(List<String> frutas) {
        if (frutas.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de frutas actuales:");
            for (String fruta : frutas) {
                System.out.println("- " + fruta);
            }
        }
    }

    // Función para contar
    static void mostrarCantidad(List<String> frutas) {
        System.out.println("Cantidad total de frutas: " + frutas.size());
    }

    // Función para reemplazar (INCLUYE DESAFÍO)
    static void reemplazarFruta(List<String> frutas, Scanner sc) {
        System.out.print("¿Qué fruta deseas reemplazar?: ");
        String frutaVieja = sc.nextLine();

        // Verificamos si existe en la lista
        if (frutas.contains(frutaVieja)) {
            System.out.print("¿Por cuál fruta la quieres cambiar?: ");
            String frutaNueva = sc.nextLine();

            // Averiguamos en qué posición (índice) está la fruta vieja
            int posicion = frutas.indexOf(frutaVieja);
            
            // Usamos .set(posición, nuevoValor) para reemplazarla
            frutas.set(posicion, frutaNueva);
            System.out.println("¡Reemplazo exitoso!");
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    // Función para eliminar (INCLUYE DESAFÍO)
    static void eliminarFruta(List<String> frutas, Scanner sc) {
        System.out.print("¿Qué fruta deseas eliminar?: ");
        String frutaBorrar = sc.nextLine();

        if (frutas.contains(frutaBorrar)) {
            // Usamos .remove(valor) para borrarla
            frutas.remove(frutaBorrar);
            System.out.println("¡Fruta eliminada correctamente!");
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }
}