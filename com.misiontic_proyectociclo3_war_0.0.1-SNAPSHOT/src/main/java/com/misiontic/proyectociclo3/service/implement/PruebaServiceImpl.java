
package com.misiontic.proyectociclo3.service.implement;

import com.misiontic.proyectociclo3.dao.PruebaDao;
import com.misiontic.proyectociclo3.Models.Prueba;
import com.misiontic.proyectociclo3.service.PruebaService;
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
public class PruebaServiceImpl implements PruebaService {
    
    @Autowired
    private PruebaDao pruebaDao;

    @Override
    @Transactional(readOnly=false)
    public Prueba save(Prueba prueba) {
        return pruebaDao.save(prueba);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        pruebaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Prueba findById(Integer id) {
        return pruebaDao.findById(id).orElse(null);
    }

    @Override
       @Transactional(readOnly=true)
    public List<Prueba> findAll() {
        return (List<Prueba>) pruebaDao.findAll();
    }
    
}
