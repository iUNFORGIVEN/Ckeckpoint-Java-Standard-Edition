
import modelo.ListaTareas;
import modelo.Tarea;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ListasTareas {
    private List<modelo.ListaTareas> listas = new ArrayList<>();
    private Lector lector = new Lector();

    public void crearListaTareas() {
        System.out.print("Ingrese el nombre de la nueva lista de tareas: ");
        String nombreLista = lector.leerTexto();
        modelo.ListaTareas nuevaLista = new modelo.ListaTareas(nombreLista, null);
        listas.add(nuevaLista);
        System.out.println("Lista de tareas '" + nombreLista + "' creada con éxito.");
    }

    public void verListasCreadas() {
        System.out.println("Listas de tareas creadas:");
        for (int i = 0; i < listas.size(); i++) {
            ListaTareas lista = listas.get(i);
            System.out.println((i + 1) + ". " + ((modelo.ListaTareas) lista).getNombre());
        }
    }

    public void verTareasDeLaLista() {
        System.out.println("Seleccione una lista de tareas para ver sus tareas:");
        verListasCreadas();
        int indiceLista = lector.leerOpcion() - 1;
        if (indiceLista >= 0 && indiceLista < listas.size()) {
            ListaTareas lista = listas.get(indiceLista);
            lista.imprimirNombresTareas();
        } else {
            System.out.println("Índice de lista no válido.");
        }
    }

    public void actualizarTareas() {
        System.out.println("Seleccione una lista de tareas para actualizar sus tareas:");
        verListasCreadas();
        int indiceLista = lector.leerOpcion() - 1;
        if (indiceLista >= 0 && indiceLista < listas.size()) {
            modelo.ListaTareas lista = listas.get(indiceLista);
            System.out.println("Seleccione una tarea para marcar como realizada:");
            lista.imprimirNombresTareas();
            int indiceTarea = lector.leerOpcion() - 1;
            if (indiceTarea >= 0 && indiceTarea < lista.obtenerNumeroTareas()) {
                Tarea tarea = lista.obtenerTareas().get(indiceTarea);
                tarea.marcarComoRealizada();
                System.out.println("Tarea '" + tarea.getNombre() + "' marcada como realizada.");
            } else {
                System.out.println("Índice de tarea no válido.");
            }
        } else {
            System.out.println("Índice de lista no válido.");
        }
    }

    public void eliminarListaTareas() {
        System.out.println("Seleccione una lista de tareas para eliminar:");
        verListasCreadas();
        int indiceLista = lector.leerOpcion() - 1;
        if (indiceLista >= 0 && indiceLista < listas.size()) {
            ListaTareas lista = listas.get(indiceLista);
            listas.remove(lista);
            System.out.println("Lista de tareas '" + ((modelo.ListaTareas) lista).getNombre() + "' eliminada.");
        } else {
            System.out.println("Índice de lista no válido.");
        }
    }
}
