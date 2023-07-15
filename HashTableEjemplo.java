import java.util.Hashtable;

public class HashTableEjemplo {
    public static void main(String[] args) {

        Hashtable<String, Boolean> asistencia = new Hashtable<>();

        /* Registrar la asistencia de los estudiantes */
        asistencia.put("Jhon", true);
        asistencia.put("Jairo", false);
        asistencia.put("Nicolas", true);        
        asistencia.put("David", false);

        String estudiante = "Jhon";

        /* Verificacion de si contiene la llave */
        if (asistencia.containsKey(estudiante)) {
            /* Obtener el valor del estudiante */
            if (asistencia.get(estudiante)) {

                System.out.println(estudiante + " está presente.");
                
            } else {

                System.out.println(estudiante + " está ausente.");
            }

            return;
        }
        
        System.out.println("El "+ estudiante +" se desconce ");
        
    }
}
