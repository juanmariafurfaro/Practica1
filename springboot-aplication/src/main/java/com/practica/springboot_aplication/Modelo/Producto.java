package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_unitario")
    private Float precioUnitario;

    @Column(name = "unidades_stock")
    private Integer unidadesStock;

    @Column(name = "unidades_reposicion")
    private Integer unidadesReposicion;

    @Column(name = "flg_discontinuo")
    private Boolean flag;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_proovedor")
    private Proovedor proovedor;


    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(Integer unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    public Integer getUnidadesReposicion() {
        return unidadesReposicion;
    }

    public void setUnidadesReposicion(Integer unidadesReposicion) {
        this.unidadesReposicion = unidadesReposicion;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
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

    public Producto() {    }
    

}
