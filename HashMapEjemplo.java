import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplo {
    public static void main(String[] args) {
        
        HashMap<String, Integer> teamMap = new HashMap<>();

        /*  Agregar equipos y su cantidad de títulos al mapa */
        teamMap.put("Real Madrid", 34);
        teamMap.put("Barcelona", 26);
        teamMap.put("Bayern Munich", 30);
        teamMap.put("Manchester United", 20);

        /*  Mostrar información de los equipos */
        System.out.println("Información de Equipos de Fútbol:");
        for (Map.Entry<String, Integer> entry : teamMap.entrySet()) {
            System.out.println("Equipo: " + entry.getKey() + ", Títulos: " + entry.getValue());
        }

        System.out.println();
        /* Obtener la cantidad de títulos de un equipo específico */
        String team = "Real Madrid";
        int titles = teamMap.getOrDefault(team, 0);
        System.out.println("Títulos de " + team + ": " + titles);
    }
}
