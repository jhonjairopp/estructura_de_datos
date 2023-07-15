import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEjemplo {
    public static void main(String[] args) {

        LinkedList<String> jugadores = new LinkedList<>();
        /* Añadir a los jugadores */
        String[] jugadoresNombre = {"Federick Farid",
                                    "Polo Polo",
                                    "Alberto Suarez",
                                    "Pedro Iriarte",
                                    "Luis Miguel"};
        /* Convertimos a una lista */
        jugadores.addAll(Arrays.asList(jugadoresNombre));
        /* Obtener el primer y ultimo jugador alfabeticamente ordenado */
        Collections.sort(jugadores);
        System.out.println("\nPrimer jugador: " + jugadores.getFirst());
        System.out.println("Ultimo jugador de la lista: " + jugadores.getLast());

        jugadores.removeFirst();
        jugadores.removeLast();

        /* Visualizar los jugadores restantes mediante un forEach */
        System.out.println("\nJugadores restantes:");
        jugadores.forEach(System.out::println);
    }
}
