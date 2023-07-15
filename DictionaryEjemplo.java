import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryEjemplo {
    public static void main(String[] args) {

        String palabraBuscada = "Gato";
        String palabraEliminada = "Casa";
        Dictionary<String, String> diccionario = new Hashtable<>();
        /* Se crean las llaves y asignan los objetos */
        diccionario.put("Gato", "Cat");
        diccionario.put("Perro", "Dog");
        diccionario.put("Casa", "House");

        /* Conseguir una llave guardada */

        if (diccionario.get(palabraBuscada) != null) {
            System.out.println("La traducción de \"" 
                                + palabraBuscada 
                                + "\" \n es: " 
                                + diccionario.get(palabraBuscada));
            return;
        }
        
        System.out.println("La palabra " 
                            + palabraBuscada 
                            + " no sé encontró");

        /* Remover del diccionario */
        System.out.println("Se removió la palabra \"" 
                            + diccionario.remove(palabraEliminada) 
                            + "\" del diccionario.");
        
    }

}
