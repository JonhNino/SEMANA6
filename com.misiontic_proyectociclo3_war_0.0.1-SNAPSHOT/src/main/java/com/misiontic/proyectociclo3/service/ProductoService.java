
package com.misiontic.proyectociclo3.service;

import com.misiontic.proyectociclo3.Models.Producto;
import java.util.List;

public interface ProductoService {
    public Producto save(Producto producto);
    public void delete(Integer id);
    public Producto findById(Integer id);
    public List<Producto> findAll();
}
