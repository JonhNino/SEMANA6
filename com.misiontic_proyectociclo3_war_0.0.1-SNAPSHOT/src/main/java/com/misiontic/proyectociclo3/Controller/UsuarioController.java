
package com.misiontic.proyectociclo3.Controller;
import com.misiontic.proyectociclo3.Models.Usuario;
import com.misiontic.proyectociclo3.service.UsuarioService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioservice;
    
    @PostMapping(value="/")
    public ResponseEntity<Usuario> agregar(@RequestBody Usuario usuario){        
        Usuario obj = usuarioservice.save(usuario);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Usuario> eliminar(@PathVariable Integer id){ 
        Usuario obj = usuarioservice.findById(id); 
        if(obj!=null) 
            usuarioservice.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @PutMapping(value="/") 
    public ResponseEntity<Usuario> editar(@RequestBody Usuario usuario){ 
        Usuario obj = usuarioservice.findById(usuario.getId_usuario()); 
        if(obj!=null) { 
            obj.setNombre_usuario(usuario.getNombre_usuario());
            obj.setClave_usuario(usuario.getClave_usuario());
            usuarioservice.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @GetMapping("/list") 
    public List<Usuario> consultarTodo(){
        return usuarioservice.findAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Usuario consultaPorId(@PathVariable Integer id){ 
        return usuarioservice.findById(id); 
    }
    
    @GetMapping("/login")
    @ResponseBody
    public Usuario consultaPorNombre(@RequestParam ("usuario") String usuario,@RequestParam ("clave") String clave) { 
        return usuarioservice.login(usuario, clave); 
    }
}
