import java.util.Arrays;
import java.util.List;

public class StreamEjemplo {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Hola", "mundo", "Estructuras", "es", "genial");

        /*  Filtrar palabras que contienen la letra 'o' */
        palabras.stream()
                .filter(p -> p.contains("o"))
                .forEach(System.out::println);

        /*  Convertir palabras a mayúsculas y mostrar */
        palabras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*  Contar la cantidad de palabras */
        long cantidadPalabras = palabras.stream()
                .count();
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
    }
}
