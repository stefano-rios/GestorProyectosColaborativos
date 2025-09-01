import controlador.SolicitudController;
import controlador.UsuarioController;
import modelo.Solicitud;
import modelo.Usuario;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        UsuarioController usuariocontroller = new UsuarioController();
        SolicitudController solicitudcontroller = new SolicitudController();


        Usuario u1 = new Usuario(1, "Juan", "J@email.com","3342","ISI", "Postulante" );
        Usuario u2 = new Usuario(2, "Garcia", "G@email.com","3358","IQ", "Creador" );

        usuariocontroller.agregarUsuario(u1);
        usuariocontroller.agregarUsuario(u2);

        for(Usuario u : usuariocontroller.listarUsuarios()){
            System.out.println(u);
        }

        Solicitud s1 = new Solicitud(1, "Quiero postularme","Pendiente");
        Solicitud s2 = new Solicitud(2, "Quiero retirarme","Aceptado");

        solicitudcontroller.agregarSolicitud(s1);
        solicitudcontroller.agregarSolicitud(s2);

        //Le cargo al usuario las dos solicitudes
        u1.setSolicitudes(solicitudcontroller.listarSolicitudes());

        //Si quiero ver las solicitudes de ese usuario
        System.out.println("El usuario " + u1.getNombre() + " tiene las siguientes solicitudes:");


        for (Solicitud s : u1.getSolicitudes()) {
            System.out.println(s);
        }







    }
}
