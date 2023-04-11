
package com.misiontic.proyectociclo3.dao;

import com.misiontic.proyectociclo3.Models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer>{
    
}
