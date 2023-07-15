import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEjemplo {
    public static void main(String[] args) {

        SortedSet<String> animales = new TreeSet<>();

        /* Agregar animales */
        animales.add("Leon");
        animales.add("Zebra");   
        animales.add("Pinguino"); 
        animales.add("Jirafa");   
        animales.add("Mono");      

        /* Mostrar los animales debido a que se ordenó */
        System.out.println("Animales en orden alfabetico:\n");
        for (String animal : animales) {
            System.out.println(animal);
        }

        /* Obtener el primer y último animal de la lista */
        System.out.println("\nPrimero: " + animales.first());
        System.out.println("Ultimo: " + animales.last());

        /* Obtener el subconjunto entre dos animales, el segundo sin incluirse */
        SortedSet<String> subconjunto = animales.subSet("Mono", "Zebra");
        System.out.println("\nSubconjunto de animales entre el 'Mono' y la Zebra':");
        for (String animal : subconjunto) {
            System.out.println(animal);
        }
    }
}
