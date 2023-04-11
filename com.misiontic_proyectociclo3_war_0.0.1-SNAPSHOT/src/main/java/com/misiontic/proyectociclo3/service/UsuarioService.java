
package com.misiontic.proyectociclo3.service;

import com.misiontic.proyectociclo3.Models.Usuario;
import java.util.List;
public interface UsuarioService {
    public Usuario save(Usuario usuario);
    public void delete(Integer id);
    public Usuario findById(Integer id);
    public List<Usuario> findAll();
    public Usuario login(String nombre, String clave);
}
