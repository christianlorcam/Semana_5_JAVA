import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Crear el Map. <Clave (Nombre), Valor (Teléfono)>
        Map<String, String> agenda = new HashMap<>();

        // Paso 2 y 3: Registrar 5 contactos
        System.out.println("Registro de contactos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el nombre del contacto " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingresa el teléfono de " + nombre + ": ");
            String telefono = scanner.nextLine();
            
            // Guardamos la información en el Map
            agenda.put(nombre, telefono);
        }

        // Paso 4: Mostrar todos los contactos. 
        // Usamos entrySet() porque un Map no es una lista simple, es un conjunto de pares (clave=valor).
        System.out.println("\n--- Contactos Registrados ---");
        for (var contacto : agenda.entrySet()) {
            // Así obtenemos la clave (nombre) y el valor (teléfono)
            System.out.println("Nombre: " + contacto.getKey() + " | Teléfono: " + contacto.getValue());
        }

        // Paso 5: Solicitar un nombre
        System.out.print("\nIngresa el nombre del contacto que deseas buscar: ");
        String nombreBuscado = scanner.nextLine();

        // Paso 6: Mostrar el teléfono asociado
        String telefonoEncontrado = agenda.get(nombreBuscado);
        
        if (telefonoEncontrado != null) {
            System.out.println("El teléfono de " + nombreBuscado + " es: " + telefonoEncontrado);
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
        
        scanner.close();
    }
}