import java.util.Arrays;

public class ArraysEjemplo {
    public static void main(String[] args) {

        String[] codigosArea = {"305", "212", "512", "415", "617"};

        /* Ordenar la lista de codigos de area en orden ascendente */ 
        Arrays.sort(codigosArea);

        /* Mostrar la lista de codigos de area ordenada */
        System.out.println("\nCodigos ordenados:");
        for (String codigo : codigosArea) {
            System.out.println(codigo);
        }

        /* Localizar un area */
        String codigoBuscado = "512";
        int indice = Arrays.binarySearch(codigosArea, codigoBuscado);
        if (indice >= 0) {
            System.out.println("\nEl codigo de area se encuentra en la posición " 
                                + indice
                                + " -> " + codigosArea[indice] );
        } else {
            System.out.println("\nEl codigo de area " 
                                + codigoBuscado 
                                + " no se encontró en el array");
        }
    }
}
