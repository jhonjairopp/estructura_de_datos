import java.util.Map;
import java.util.TreeMap;

public class TreeMapEjemplo {
     public static void main(String[] args) {
        
        TreeMap<String, Integer> prendas = new TreeMap<>();
        /*  Agregar prendas al TreeMap */
        prendas.put("Camisa", 100000);
        prendas.put("Pantalón", 40000);
        prendas.put("Zapatos", 80000);
        prendas.put("Vestido", 60000);
        prendas.put("Sombrero", 20000);
        /*  Mostrar las prendas en orden alfabético por su nombre*/
        System.out.println("Prendas en orden alfabético por su nombre:");
        for (Map.Entry<String, Integer> entrada : prendas.entrySet()) {
            System.out.println(entrada.getKey() + ": $" + entrada.getValue());
        }
        /*  Obtener el precio de una prenda específica*/
        String prendaBuscada = "Pantalón";
        if (prendas.containsKey(prendaBuscada)) {
            Integer precio = prendas.get(prendaBuscada);
            System.out.println("\nEl precio del " + prendaBuscada + " es: $" + precio);
        } else {
            System.out.println("\nLa prenda " + prendaBuscada + " no se encuentra en el mapa.");
        }

        /* Eliminar una prenda del mapa */
        String prendaEliminar = "Sombrero";
        prendas.remove(prendaEliminar);
        System.out.println("\nLa prenda " + prendaEliminar + " ha sido eliminada del mapa.");

        /*  Mostrar el tamaño del mapa */
        int tamañoMapa = prendas.size();
        System.out.println("\nTamaño del mapa: " + tamañoMapa);
    }
}
