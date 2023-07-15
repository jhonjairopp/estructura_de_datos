import java.util.HashMap;
import java.util.Map;

public class MapEjemplo {
    public static void main(String[] args) {
        /*  Crear un objeto Map desde su implementacion HashMap */
        Map<Integer, String> estudiantes = new HashMap<>();
        /* Se agregan los valores para cada estudiante */
        estudiantes.put(1001, "Juan Pérez");
        estudiantes.put(1002, "María López");
        estudiantes.put(1003, "Pedro Gómez");
        /*  Mostrar información de estudiantes */
        System.out.println("Información de Estudiantes:");
        for (Map.Entry<Integer, String> estudiante : estudiantes.entrySet()) {
            System.out.println("ID: " + estudiante.getKey() + ", Nombre: " + estudiante.getValue());
        }
        /*  Obtener información de un estudiante por su ID */
        int id = 1002;
        String nombre = estudiantes.get(id);
        System.out.println("\nNombre del estudiante con ID " + id + ": " + nombre);

        /*  Verificar si un estudiante existe en el map */
        boolean existe = estudiantes.containsKey(1003);
        System.out.println("Estudiante con id 1003 existe: " + existe);

        /*  Eliminar un estudiante del mapa */
        estudiantes.remove(1001);

        /*  Mostrar información actualizada de estudiantes */
        System.out.println("Información de Estudiantes Actualizada:");
        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }
    }
}
