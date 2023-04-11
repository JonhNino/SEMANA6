
package com.misiontic.proyectociclo3.service.implement;
import com.misiontic.proyectociclo3.dao.UsuarioDao;
import com.misiontic.proyectociclo3.Models.Usuario;
import com.misiontic.proyectociclo3.service.UsuarioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;import com.misiontic.proyectociclo3.dao.ClienteDao;
import com.misiontic.proyectociclo3.Models.Cliente;
import com.misiontic.proyectociclo3.service.ClienteService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly=false)
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        usuarioDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario login(String nombre, String clave) {
        return usuarioDao.login(nombre, clave);
    }
    
}
