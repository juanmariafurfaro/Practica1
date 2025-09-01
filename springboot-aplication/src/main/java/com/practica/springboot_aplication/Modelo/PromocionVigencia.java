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

    public Long getIdPromocionVigencia() {
        return idPromocionVigencia;
    }

    public void setIdPromocionVigencia(Long idPromocionVigencia) {
        this.idPromocionVigencia = idPromocionVigencia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_Promocion")
    private Promocion promocion;


}
