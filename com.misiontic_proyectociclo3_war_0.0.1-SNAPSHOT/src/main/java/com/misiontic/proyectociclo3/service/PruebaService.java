
package com.misiontic.proyectociclo3.service;

import com.misiontic.proyectociclo3.Models.Prueba;
import java.util.List;
public interface PruebaService {
    public Prueba save(Prueba prueba);
    public void delete(Integer id);
    public Prueba findById(Integer id);
    public List<Prueba> findAll();
}
