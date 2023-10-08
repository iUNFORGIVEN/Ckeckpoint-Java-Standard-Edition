public class Main {
    public static void main(String[] args) {
        ListasTareas listasTareas = new ListasTareas();
        Lector lector = new Lector();

        while (true) {
            System.out.println("\n==SELECCIONA UNA OPCIÓN==\n");
            System.out.println("1. Crear nueva lista de tareas");
            System.out.println("2. Ver listas de tareas");
            System.out.println("3. Ver tareas de lista");
            System.out.println("4. Actualizar lista de tareas");
            System.out.println("5. Eliminar lista de tareas");
            System.out.println("6. Salir");
            System.out.print("Por favor, elije una opción: ");
            System.out.println("\n");

            int opcion = lector.leerOpcion();

            switch (opcion) {
                case 1:
                    listasTareas.crearListaTareas();
                    break;

                case 2:
                    listasTareas.verListasCreadas();
                    break;

                case 3:
                    listasTareas.verTareasDeLaLista();
                    break;

                case 4:
                    listasTareas.actualizarTareas();
                    break;

                case 5:
                    listasTareas.eliminarListaTareas();
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Por favor, elija una opción válida.");
            }
        }
    }
}