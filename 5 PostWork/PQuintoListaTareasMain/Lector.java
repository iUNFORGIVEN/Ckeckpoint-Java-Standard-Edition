import java.util.Scanner;

public class Lector {
    private Menu menu;
    private ListasTareas listasTareas;

    public Lector() {
        menu = new Menu();
        listasTareas = new ListasTareas();
    }

    public void ejecutar() {
        boolean salir = false;

        while (!salir) {
            menu.mostrarMenu();
            short opcion = menu.leerOpcion();

            switch (opcion) {
                case 1:

                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Ingrese el nombre de la nueva ListaTareas: ");
                    String nombreLista = scanner.nextLine();
                    scanner.close();

                    ListaTareas nuevaLista = new ListaTareas(nombreLista);
                    listasTareas.agregarLista(nuevaLista);
                    System.out.println("Nueva lista de tareas creada con éxito.");
                    break;
                case 2:
                    listasTareas.verListas();
                    break;
                case 3:

                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Seleccione la lista de tareas (ingrese el número): ");
                    int indiceListaVer = scanner3.nextInt() - 1;
                    scanner3.nextLine();
                    listasTareas.verTareasDeLista(indiceListaVer);
                    break;
                case 4:

                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Seleccione la lista de tareas a actualizar (ingrese el número): ");
                    int indiceListaActualizar = scanner4.nextInt() - 1;
                    scanner4.nextLine(); // Consumir el salto de línea pendiente
                    listasTareas.actualizarLista(indiceListaActualizar);
                    break;
                case 5:

                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Seleccione la lista de tareas a eliminar (ingrese el número): ");
                    int indiceListaEliminar = scanner5.nextInt() - 1;
                    scanner5.nextLine();
                    listasTareas.eliminarLista(indiceListaEliminar);
                    break;
                case