package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solicitud {
    private int id;
    private String mensaje;
    private Date fecha = new Date();
    private String estado;
    private Usuario usuario;


    public Solicitud(){}

    public Solicitud(int id, String mensaje, String estado){
        this.id = id;
        this.mensaje = mensaje;
        this.fecha = new Date();
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "id=" + id +
                ", mensaje='" + mensaje + '\'' +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                '}';
    }
}




