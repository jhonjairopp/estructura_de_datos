import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEjemplo {
    public static void main(String[] args) {

        /* Se asigna una implementacion como ArrayList */
        Collection<String> nombres = new ArrayList<>();
        /* Añadimos los nombres */
        nombres.add("Jhon");
        nombres.add("Jairo");

        String nombreBuscado = "Jairo";
        Iterator<String> iterator = nombres.iterator();
        /* Iterar */
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            if (nombre.equals(nombreBuscado)) {
                /* Remover el nombre */
                iterator.remove();
                System.out.println("Nombre eliminado: " + nombre);
                return;
            }
        }

        /* Limpiar la coleccion */
        nombres.clear();
        System.out.println("Vacio : " + nombres.isEmpty());
    }
}
