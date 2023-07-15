import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        /* Creacion de la instancia */
        ArrayList<String> tareasPendientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- GESTOR TAREAS -----");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("0. Salir");
            System.out.print(" ->: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    /* Se agrega la tarea a la lista*/
                    tareasPendientes.add(scanner.nextLine());
                    System.out.println("\nTarea agregada correctamente.\n");
                    break;

                case 2:
                    if (tareasPendientes.isEmpty()) {
                        System.out.println("No hay tareas pendientes.\n");
                    } else {
                        System.out.println("\nTareas pendientes:");
                        /* Se utiliza un ForEach para mostrar cada elemento*/
                        tareasPendientes.forEach(System.out::println);
                        System.out.println();
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nError - Opcion invalida.\n");
                    break;
            }
        } while (opcion != 0);

        System.out.println("Adios");
        scanner.close();
    }
}
