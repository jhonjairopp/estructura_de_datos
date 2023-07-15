import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEjemplo {
    public static void main(String[] args) {

        List<Integer> baloto = new ArrayList<>();
        /* Generar las bolas del Baloto (números del 1 al 45)*/
        for (int i = 1; i <= 45; i++) {
            baloto.add(i);
        }

        /* Mezclar las bolas en orden aleatorio mediante shuffle*/
        Collections.shuffle(baloto);

        /* Mostrar las bolas ganadoras */
        System.out.println("Ganadoras");
        for (int i = 0; i < 9; i++) {
            System.out.println("Bola " + (i + 1) + ": " + baloto.get(i));
        }
        System.out.println("SuperBola 10: " + baloto.get(9));
    }
}
