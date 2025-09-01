package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Promocion_Vigencia")
public class PromocionVigencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Promocion_Vigencia")
    private Long idPromocionVigencia;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_Promocion")
    private Promocion promocion;


}
