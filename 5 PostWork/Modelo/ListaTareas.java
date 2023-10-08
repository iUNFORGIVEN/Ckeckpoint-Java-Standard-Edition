package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListasTareas {
    private List<ListaTareas> listas;

    public ListasTareas() {
        listas = new ArrayList<>();
    }

    public void agregarLista(ListaTareas lista) {
        listas.add(lista);
    }

    public void verListas() {
        System.out.println("Listas de tareas disponibles:");
        for (int i = 0; i < listas.size(); i++) {
            System.out.println((i + 1) + ". " + listas.get(i).getNombre());
        }
    }

    public void verTareasDeLista(int indiceLista) {
        if (i >= 0 && indiceLista < listas.size()) {
            ListaTareas listaSeleccionada = listas.get(indiceLista);
            System.out.println("Tareas de la lista: " + listaSeleccionada.getNombre());
        } else {
            System.out.println("Índice de lista inválido.");
        }
    }

    public void actualizarLista(int indiceLista) {
        if (indiceLista >= 0 && indiceLista < listas.size()) {
            ListaTareas listaSeleccionada = listas.get(indiceLista);
            System.out.println("Actualizar la lista: " + listaSeleccionada.getNombre());
        } else {
            System.out.println("El Indice ingresado es invalidoclear.");
        }
    }

    public void eliminarLista(int indiceLista) {
        if (indiceLista >= 0 && indiceLista < listas.size()) {
            ListaTareas listaSeleccionada = listas.get(indiceLista);
            listas.remove(indiceLista);
            System.out.println("Lista eliminada: " + listaSeleccionada.getNombre());
        } else {
            System.out.println("Índice de lista inválido.");
        }
    }
}