import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEjemplo {
    public static void main(String[] args) {
        
        /* Añadimos los datos */
        Vector<String> colores = new Vector<>();
        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Rojo");

        /* Creamos la instancia Enumeration */
        Enumeration<String> enumeration = colores.elements();
        
        System.out.println("Colores de la bandera Colombiana son:");

        /* Usamos hasMoreElements para verificar si hay mas elementos*/
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
