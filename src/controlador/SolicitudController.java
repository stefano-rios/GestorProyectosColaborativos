package controlador;

import modelo.Solicitud;
import java.util.ArrayList;
import java.util.List;

public class SolicitudController {
    private List<Solicitud> solicitudes = new ArrayList<>();

    public void agregarSolicitud(Solicitud solicitud){
        solicitudes.add(solicitud);
    }

    public List<Solicitud> listarSolicitudes() {
        return solicitudes;
    }

}
