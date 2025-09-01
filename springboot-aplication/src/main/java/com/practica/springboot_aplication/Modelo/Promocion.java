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



}
