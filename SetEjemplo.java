import java.util.HashSet;
import java.util.Set;

public class SetEjemplo {
    public static void main(String[] args) {
        String texto = "El sol brillaba radiante sobre los maravillados cielos, "
                        + "mientras la ola brillante rompía en la brillante "
                        + "orilla, creando un espectáculo deslumbrante y brillante"
                        + " para los espectadores maravillados.";

        /* Se divide el texto en palabras */
        String[] palabras = texto.split(" ");

        /* Se crea una instancia de la interfaz Set para agrupar palabras unicas */
        Set<String> palabrasUnicas = new HashSet<>();

        /* Se recorre para ir añadiendo y parseando las palabras */
        for (String palabra : palabras) {
            /* se filtran las palabras */
            palabra = palabra.replaceAll("[^a-zA-Z0-9]+$", "");
            palabrasUnicas.add(palabra.toLowerCase());
        }

        /* Se muestran las palabras unicas y cantidad de ellas */
        System.out.println("\nPalabras unicas:\n");
        for (String palabraUnica : palabrasUnicas) {
            System.out.println(palabraUnica);
        }

        System.out.println("\nUnicas/totales: " + palabrasUnicas.size() + "/" + palabras.length);
    }
}
