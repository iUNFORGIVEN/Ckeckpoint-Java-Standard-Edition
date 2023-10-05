import java.util.Scanner;

public class listaTareasMain {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        short numeroOpcion = 0;
        String textoOpcion = "";

        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");

        System.out.print("Seleccione una opción: ");

        if (scanner.hasNextShort()) {
            numeroOpcion = scanner.nextShort();
            scanner.nextLine();

            switch (numeroOpcion) {
                case 1:
                    textoOpcion = "1. Crear nueva lista de tareas\n En construcción.";
                    break;
                case 2:
                    textoOpcion = "2. Ver listas de tareas\n En construcción.";
                    break;
                case 3:
                    textoOpcion = "3. Ver tareas de lista\n En construcción.";
                    break;
                case 4:
                    textoOpcion = "4. Actualizar lista de tareas\n En construcción.";
                    break;
                case 5:
                    textoOpcion = "5. Eliminar lista de tareas\n En construcción.";
                    break;
                default:
                    textoOpcion = "Opción inválida";
                    break;
            }

            System.out.println("La opción seleccionada es: " + textoOpcion);
        } else {
            System.out.println("Entrada inválida. Por favor, seleccione una opción válida.");
        }

        scanner.close();
    }
}