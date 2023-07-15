import java.util.HashSet;

public class HashSetEjemplo {
    public static void main(String[] args) {

        HashSet<String> atracciones = new HashSet<>();

        /* Agregacion de Atracciones */
        atracciones.add("Montaña Rusa");
        atracciones.add("Caida Libre");
        atracciones.add("Carrusel");
        atracciones.add("Casa Embrujada");

        /* Debido a que es HashSet intentamos agregar nuevamente, pero no se agregará*/
        atracciones.add("Montaña Rusa");

        /* Mostrar las atracciones del parque*/
        System.out.println("Atracciones:");
        for (String atraccion : atracciones) {
            System.out.println(atraccion);
        }

        /* Verificar si una atraccion se encuentra */
        System.out.println("\nCaida libre habilitado: " 
        + atracciones.contains("Caida Libre"));

        /* Eliminacion */
        atracciones.remove("Carrusel");

        /* Mostrar atracciones luego de todo lo ocurrido */
        System.out.println("\nAtracciones actualizada:");
        for (String atraccion : atracciones) {
            System.out.println(atraccion);
        }
    }
}
