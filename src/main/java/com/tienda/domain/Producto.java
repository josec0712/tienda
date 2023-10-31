package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Dennis
 */
@Data
@Entity
@Table(name = "producto")

/* Serializaci[on va almacenar datos de la bd*/

public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L; /*Poder hacer ciclo de sumatoria*/
    
    @Id /*Id es la llave de la tabla producto*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
