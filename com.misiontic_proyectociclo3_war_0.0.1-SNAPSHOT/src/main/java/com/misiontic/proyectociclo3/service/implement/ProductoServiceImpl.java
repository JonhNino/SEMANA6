
package com.misiontic.proyectociclo3.service.implement;

import com.misiontic.proyectociclo3.dao.ProductoDao;
import com.misiontic.proyectociclo3.Models.Producto;
import com.misiontic.proyectociclo3.service.ProductoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional(readOnly=false)
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        productoDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Producto findById(Integer id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }
    
}
