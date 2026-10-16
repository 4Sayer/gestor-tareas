package gestor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorTareas {
    private static List<Tarea> tareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Gestor de Tareas");

        while (true) {
            System.out.println("\n1. Registrar tarea\n2. Listar tareas\n3. Completar tarea\n4. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        System.out.print("Escriba la descripción de la tarea: ");
                        tareas.add(new Tarea(scanner.nextLine()));
                        System.out.println("¡Tarea registrada exitosamente!");
                        break;
                    case 2:
                        System.out.println("--- Lista de Tareas ---");
                        if (tareas.isEmpty()) System.out.println("No hay tareas registradas aún.");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(i + " - " + tareas.get(i));
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el número (índice) de la tarea a completar: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        tareas.get(index).marcarCompletada();
                        System.out.println("¡Tarea marcada como completada!");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Error: Opción inválida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: El número de tarea seleccionado no existe.");
            }
        }
    }
}
