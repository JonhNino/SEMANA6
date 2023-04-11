
package com.misiontic.proyectociclo3.dao;
import com.misiontic.proyectociclo3.Models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {
    @Transactional(readOnly=true)
    @Query(value="SELECT * from usuario WHERE nombre_usuario= :usuario AND clave_usuario= :clave", nativeQuery = true )
    public Usuario login(@Param("usuario") String usuario, @Param("clave") String clave);
    
}
