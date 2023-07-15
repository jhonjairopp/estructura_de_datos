import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class ColeccionesPrograma {
    public static void main(String[] args) {
        // Crear una clase cualquiera (en este caso, String)
        String objeto1 = "Objeto numero 1";
        String objeto2 = "Objeto numero 2";
        String objeto3 = "Objeto numero 3";
        String objeto4 = "Objeto numero 4";
        String objeto5 = "Objeto numero 5";

        // ------------- Punto 1: Agregar objetos a las colecciones -----------
        // List
        List<String> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);        
        lista.add(objeto4);        
        lista.add(objeto5);

        // Set
        Set<String> conjunto = new HashSet<>();
        conjunto.add(objeto1);
        conjunto.add(objeto2);
        conjunto.add(objeto3);
        conjunto.add(objeto4);        
        conjunto.add(objeto5);

        // Map
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, objeto1);
        mapa.put(2, objeto2);
        mapa.put(3, objeto3);
        mapa.put(4, objeto4);
        mapa.put(5, objeto5);

        // Stack
        Stack<String> pila = new Stack<>();
        pila.push(objeto1);
        pila.push(objeto2);
        pila.push(objeto3);
        pila.push(objeto4);
        pila.push(objeto5);

        // Queue
        Queue<String> cola = new LinkedList<>();
        cola.add(objeto1);
        cola.add(objeto2);
        cola.add(objeto3);
        cola.add(objeto4);
        cola.add(objeto5);

        // ---------------- Punto 2: Buscar objetos ------------------------
        // List
        String buscadoLista = lista.get(1);
        // Set
        boolean existeConjunto = conjunto.contains(objeto2);
        // Map
        String buscadoMapa = mapa.get(2);
        // Stack
        String buscadoPila = pila.peek();
        // Queue
        String buscadoCola = cola.peek();

        // ----------------- Punto 3: Insertar objetos --------------------
        // Solo List puede insertar
        lista.add(1, objeto4);

        // ----------------  Punto 4: Eliminar objetos ----------------------
        // List
        lista.remove(objeto3);
        // Set
        conjunto.remove(objeto3);
        // Map
        mapa.remove(3);
        // Stack
        pila.pop();
        // Queue
        cola.poll();

        // ------------------ Punto 5: Saber si un objeto existe --------------
        // List
        boolean existeLista = lista.contains(objeto5);
        // Set
        boolean existeConjunto2 = conjunto.contains(objeto5);
        // Map
        boolean existeMapa = mapa.containsValue(objeto5);
        // Stack
        boolean existePila = pila.contains(objeto5);
        // Queue
        boolean existeCola = cola.contains(objeto5);

        
        // -------------------  Punto b: Recorrer un objeto de tipo List  --------
        System.out.println("Recorriendo un objeto de tipo List:");
        // for Normal
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        // for-each
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        // while
        int index = 0;
        while (index < lista.size()) {
            System.out.println(lista.get(index));
            index++;
        }
        // do-while
        int index2 = 0;
        do {
            System.out.println(lista.get(index2));
            index2++;
        } while (index2 < lista.size());

        // ----------- Punto c: Ordenar objetos en una lista -----------
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // -------------- Punto d: Recorrer un objeto de tipo Set ---------------
        System.out.println("Recorriendo un objeto de tipo Set:");
        // for traditional
        Iterator<String> iterator1 = conjunto.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        // foreach
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
        // while
        Iterator<String> iterator2 = conjunto.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        // do/while
        Iterator<String> iterator3 = conjunto.iterator();
        do {
            System.out.println(iterator3.next());
        } while (iterator3.hasNext());

        // ------------ Punto e: Recorrer un objeto de tipo Map ----------
        System.out.println("Recorriendo un objeto de tipo Map:");
        // for traditional
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        // foreach
        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }
        // while
        Iterator<Map.Entry<Integer, String>> iterator4 = mapa.entrySet().iterator();
        while (iterator4.hasNext()) {
            Map.Entry<Integer, String> entry = iterator4.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        // do/while
        Iterator<Map.Entry<Integer, String>> iterator5 = mapa.entrySet().iterator();
        do {
            Map.Entry<Integer, String> entry = iterator5.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        } while (iterator5.hasNext());

        //-------------- Punto f: Recorrer un objeto de tipo List usando stream -------------
        System.out.println("Recorriendo un objeto de tipo List usando stream:");
        lista.stream().forEach(System.out::println);

        // ------------- Punto g: Recorrer un objeto de tipo Set usando stream ------------
        System.out.println("Recorriendo un objeto de tipo Set usando stream:");
        conjunto.stream().forEach(System.out::println);

        // ------------- Punto h: Recorrer un objeto de tipo Map usando stream ------------
        System.out.println("Recorriendo un objeto de tipo Map usando stream:");
        mapa.entrySet().stream().forEach(entry ->
                System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue()));

        // -------------Punto i: Recorrer un objeto de tipo List usando una función flecha o función lambda
        System.out.println("Recorriendo un objeto de tipo List usando función flecha o función lambda:");
        lista.forEach(elemento -> System.out.println(elemento));

        // ----------- Punto j: Recorrer un objeto de tipo Set usando una función flecha o función lambda
        System.out.println("Recorriendo un objeto de tipo Set usando función flecha o función lambda:");
        conjunto.forEach(elemento -> System.out.println(elemento));

        // -------------- Punto k: Recorrer un objeto de tipo Map usando una función flecha o función lambda
        System.out.println("Recorriendo un objeto de tipo Map usando función flecha o función lambda:");
        mapa.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor: " + valor));

        // --------------- Punto l: Convertir un array en un objeto List ----------------
        String[] array = {"Elemento 1", "Elemento 2", "Elemento 3"};
        List<String> listaFromArray = Arrays.asList(array);

        // ------------------ Punto m: Convertir un objeto List a un array ---------------
        String[] arrayFromList = lista.toArray(new String[0]);

        // Punto n: Dos formas de unir dos listas en una sola
        List<String> lista1 = new ArrayList<>(Arrays.asList("Elemento 1", "Elemento 2"));
        List<String> lista2 = new ArrayList<>(Arrays.asList("Elemento 3", "Elemento 4"));
        List<String> listaUnida = new ArrayList<>(lista1);
        listaUnida.addAll(lista2);

        // ------------- Punto o: Desordenar una Lista ---------------------
        Collections.shuffle(listaUnida);
        System.out.println("Lista desordenada: " + listaUnida);
    }
}
