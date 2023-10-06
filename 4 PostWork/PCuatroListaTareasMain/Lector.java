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
                    listasTareas.crearNuevaLista();
                    break;
                case 2:
                    listasTareas.verListas();
                    break;
                case 3:
                    listasTareas.verTareasDeLista();
                    break;
                case 4:
                    listasTareas.actualizarLista();
                    break;
                case 5:
                    listasTareas.eliminarLista();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        menu.closeScanner();
    }

}
