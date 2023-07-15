import java.util.ArrayList;
import java.util.List;

public class ListEjemplo {
    public static void main(String[] args) {
        
        List<Integer> disparos = new ArrayList<>();

        /*  Simular distancia de disparos realizados*/
        disparos.add(10);
        disparos.add(20);
        disparos.add(30);
        disparos.add(15);
        disparos.add(25);
        /* Simular la distancia a la que se encuentra un alien*/ 
        List<Integer> aliens = new ArrayList<>();
        aliens.add(15);
        aliens.add(25);
        aliens.add(35);

        /*  Mostrar la lista de aliens */
        System.out.println("Aliens:");
        for (int num = 0; num < aliens.size(); num++) {
            System.out.println("Alien (" + (num+1) 
                                + ") Distancia: " 
                                + aliens.get(num));
        }
        System.out.println();
        /* Verificar si algún alien está contenido en la lista de disparos */
        boolean algunAlienAlcanzado = false;
        int alcanzados = 0;
        for (int alien : aliens) {
            if (disparos.contains(alien)) {
                disparos.remove(Integer.valueOf(alien));
                System.out.println("¡Disparo exitoso! El Alien ("
                                    + (aliens.indexOf(alien)+1)
                                    +") estaba a una distancia de " 
                                    + alien);
                alcanzados++;
                algunAlienAlcanzado = true;
            }
        }

        /* Confirmar si se alcanzó algun alien*/ 
        if (!algunAlienAlcanzado) {
            System.out.println("\n¡Los disparos no alcanzaron ningún alien!");
            return;
        }

        System.out.println("\n¡Alcanzados!:" + alcanzados);

    }
}
