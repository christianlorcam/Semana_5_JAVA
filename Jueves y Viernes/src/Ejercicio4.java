import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Paso 1 y 2: Crear lista y agregar varias notas
        List<Double> notas = new ArrayList<>();
        notas.add(3.5);
        notas.add(4.2);
        notas.add(5.0);
        notas.add(2.8);
        notas.add(6.5);
        notas.add(4.0);

        System.out.println("Todas las notas: " + notas);
        System.out.println("\n--- Notas Aprobadas ---");

        // Paso 3: Utilizar Stream para mostrar solo las aprobadas (>= 4.0)
        // El símbolo '->' se llama expresión Lambda. Significa "dada esta nota 'n', verifica que 'n' sea mayor o igual a 4.0"
        notas.stream()
             .filter(n -> n >= 4.0)
             .forEach(n -> System.out.println(n));

        // Paso 4: Contar cuántas notas aprobadas existen
        // Volvemos a crear un stream para contar, porque los streams se "consumen" después de usarlos.
        long cantidadAprobadas = notas.stream()
                                      .filter(n -> n >= 4.0)
                                      .count();

        System.out.println("\nTotal de notas aprobadas: " + cantidadAprobadas);
    }
}