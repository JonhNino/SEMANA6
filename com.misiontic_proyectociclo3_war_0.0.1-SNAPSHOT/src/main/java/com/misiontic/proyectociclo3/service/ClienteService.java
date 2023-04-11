
package com.misiontic.proyectociclo3.service;

import com.misiontic.proyectociclo3.Models.Cliente;
import java.util.List;

public interface ClienteService {
    public Cliente save(Cliente cliente);
    public void delete(Integer id);
    public Cliente findById(Integer id);
    public List<Cliente> findAll();
}
