
package com.misiontic.proyectociclo3.service.implement;

import com.misiontic.proyectociclo3.dao.ClienteDao;
import com.misiontic.proyectociclo3.Models.Cliente;
import com.misiontic.proyectociclo3.service.ClienteService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly=false)
    public Cliente save(Cliente cliente) {
         return clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        clienteDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
    
}
