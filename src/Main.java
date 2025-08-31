import controlador.UsuarioController;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        UsuarioController usuarioController = new UsuarioController();

        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan", "juan@email.com", "1234", "Ingeniería", "admin");
        Usuario usuario2 = new Usuario(2, "Lucía", "lucia@email.com", "abcd", "Diseño", "usuario");

        // Agregar al controlador
        usuarioController.agregarUsuario(usuario1);
        usuarioController.agregarUsuario(usuario2);

        // Mostrar en consola
        System.out.println("📋 Lista de usuarios:");
        for (Usuario u : usuarioController.listarUsuarios()) {
            System.out.println(u); // Gracias al toString() se ve bien
        }
    }
}
