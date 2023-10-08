package modelo;

import java.util.Date;

public class ListaTareas {
    private String nombre;
    private Date fechaCreacion;


    public ListaTareas(String nombre, Object o) {
        this.nombre = nombre;
    }

    {
        fechaCreacion = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
}