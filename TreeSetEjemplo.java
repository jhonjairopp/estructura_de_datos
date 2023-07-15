import java.util.TreeSet;

public class TreeSetEjemplo {
    public static void main(String[] args) {
    
        TreeSet<String> planetas = new TreeSet<>();

        /* Agregamos los planetas*/
        planetas.add("Mercurio");
        planetas.add("Venus");
        planetas.add("Tierra");
        planetas.add("Marte");
        planetas.add("Júpiter");
        planetas.add("Saturno");
        planetas.add("Urano");
        planetas.add("Neptuno");

        /*  Mostrar los planetas en orden alfabético */
        System.out.println("Planetas en orden alfabético:");
        for (String planeta : planetas) {
            System.out.println(planeta);
        }
        /*  Obtener el planeta anterior y siguiente a la Tierra */
        System.out.println("\nPlaneta anterior a la Tierra: " + planetas.lower("Tierra"));
        System.out.println("Planeta siguiente a la Tierra: " + planetas.higher("Tierra"));

        System.out.println("\nPrimer planeta: " + planetas.first());
        System.out.println("Ultimo planeta: " + planetas.last());
    }
}
