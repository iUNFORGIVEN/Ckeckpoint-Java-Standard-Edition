package modelo;

import java.util.Date;

public class Tarea {
    private String nombre;
    private final Date fechaCreacion; // Hacemos que sea final para que no sea modificable
    private Date fechaExpiracion;
    private boolean realizada;
    private Date fechaRealizacion;

    public Tarea(String nombre) {
        this.nombre = nombre;
        fechaCreacion = new Date(); // Asignamos el valor en el constructor
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

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
}