package com.practica.springboot_aplication.Modelo;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Promocion")
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Promocion")
    private Long idPromocion;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "promocion")
    private List<PromocionVigencia> promociones;

    public Long getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Long idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<PromocionVigencia> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<PromocionVigencia> promociones) {
        this.promociones = promociones;
    }

    public Promocion() {    }
    


}
