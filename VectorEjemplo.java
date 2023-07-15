import java.util.Vector;

public class VectorEjemplo {
    public static void main(String[] args) {

        Vector<String> playlist = new Vector<>();

        /* Agregacion de canciones*/
        playlist.add("Exist For Love");
        playlist.add("Runaway");
        playlist.add("Running With The Wolves");        
        playlist.add("The Seed");

        /* Comprobamos si la lista está vacia */
        if (!playlist.isEmpty()) {

            System.out.println("Lista de reproducción:");
            for (String cancion : playlist) {
                System.out.println(cancion);
            }

            /* Supongamos que escogemos la primera cancion */
            System.out.println("\nReproduciendo: " + playlist.firstElement());
        
            /* Preguntamos cual es la segunda cancion */
             System.out.println("Siguiente:" + playlist.get(1) );

             /* Convertimos en un vector primitivo*/
             String[] vector = {}; 
             vector = playlist.toArray(vector);

             System.out.println("Ultima:" + vector[playlist.size()-1]);
        }
    }
}
