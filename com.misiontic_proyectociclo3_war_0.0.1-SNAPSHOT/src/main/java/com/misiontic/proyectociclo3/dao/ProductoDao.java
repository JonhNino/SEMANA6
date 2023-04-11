
package com.misiontic.proyectociclo3.dao;

import com.misiontic.proyectociclo3.Models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Integer> {
   
}
