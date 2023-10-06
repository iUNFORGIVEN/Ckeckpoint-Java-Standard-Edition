import java.util.Scanner;

public class Menu {

    private Scanner sc;
    public Menu() {
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("== SELECCIONA UNA OPCIÓN ==");
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");
        System.out.println("6. Salir");
    }

    public short leerOpcion() {
        if (sc.hasNextShort()) {
            return sc.nextShort();
        }
        return -1;
    }

    public void closeScanner() {
        sc.close();
    }
}
