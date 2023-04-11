
package com.misiontic.proyectociclo3.Controller;
import com.misiontic.proyectociclo3.Models.Prueba;
import com.misiontic.proyectociclo3.service.PruebaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/prueba")
public class PruebaController {
    @Autowired
    private PruebaService pruebaservice;
    
    @PostMapping(value="/")
    public ResponseEntity<Prueba> agregar(@RequestBody Prueba prueba){        
        Prueba obj = pruebaservice.save(prueba);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Prueba> eliminar(@PathVariable Integer id){ 
        Prueba obj = pruebaservice.findById(id); 
        if(obj!=null) 
            pruebaservice.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @PutMapping(value="/") 
    public ResponseEntity<Prueba> editar(@RequestBody Prueba prueba){ 
        Prueba obj = pruebaservice.findById(prueba.getId_prueba()); 
        if(obj!=null) { 
            obj.setDescripcion_prueba(prueba.getDescripcion_prueba());
            pruebaservice.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @GetMapping("/list") 
    public List<Prueba> consultarTodo(){
        return pruebaservice.findAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Prueba consultaPorId(@PathVariable Integer id){ 
        return pruebaservice.findById(id); 
    }
}
