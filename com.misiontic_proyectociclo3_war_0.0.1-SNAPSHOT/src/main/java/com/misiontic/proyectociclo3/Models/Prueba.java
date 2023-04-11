
package com.misiontic.proyectociclo3.Models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name="prueba")
public class Prueba implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_prueba")
    private int id_prueba;
    @Column(name="descripcion_prueba")
    private String descripcion_prueba;

    public Prueba(int id_prueba, String descripcion_prueba) {
        this.id_prueba = id_prueba;
        this.descripcion_prueba = descripcion_prueba;
    }

    public Prueba() {
    }

    public int getId_prueba() {
        return id_prueba;
    }

    public void setId_prueba(int id_prueba) {
        this.id_prueba = id_prueba;
    }

    public String getDescripcion_prueba() {
        return descripcion_prueba;
    }

    public void setDescripcion_prueba(String descripcion_prueba) {
        this.descripcion_prueba = descripcion_prueba;
    }
    
    

}

