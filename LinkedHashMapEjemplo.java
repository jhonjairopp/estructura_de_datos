import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEjemplo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> vehiculosVendidos = new LinkedHashMap<>();

        /*  Registrar vehículos vendidos con su fecha de venta */
        vehiculosVendidos.put("ABC123", "2023-07-01");
        vehiculosVendidos.put("XYZ789", "2023-07-05");
        vehiculosVendidos.put("DEF456", "2023-07-10");
        vehiculosVendidos.put("GHI789", "2023-07-12");
        vehiculosVendidos.put("JKL321", "2023-07-15");

        /*  Mostrar el registro de vehículos vendidos en orden de venta */
        System.out.println("Registro de vehículos vendidos:");
        for (Map.Entry<String, String> entrada : vehiculosVendidos.entrySet()) {
            String vehiculo = entrada.getKey();
            String fechaVenta = entrada.getValue();
            System.out.println("Vehículo: " + vehiculo + " - Fecha de venta: " + fechaVenta);
        }
    }
}
