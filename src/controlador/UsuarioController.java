package controlador;

import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    // Agregar un usuario a la lista
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Listar todos los usuarios
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    // Buscar usuario por ID (opcional)
    public Usuario buscarPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    // Eliminar usuario por ID (opcional)
    public boolean eliminarUsuario(int id) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }
}
