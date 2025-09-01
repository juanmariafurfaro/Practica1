package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "Proovedor_Categoria")
public class ProovedorCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proovedor_categoria")
    private Long idProovedorCategoria;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Long getIdProovedorCategoria() {
        return idProovedorCategoria;
    }

    public void setIdProovedorCategoria(Long idProovedorCategoria) {
        this.idProovedorCategoria = idProovedorCategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proovedor getProovedor() {
        return proovedor;
    }

    public void setProovedor(Proovedor proovedor) {
        this.proovedor = proovedor;
    }

    @ManyToOne
    @JoinColumn(name = "id_proovedor")
    private Proovedor proovedor;


}
