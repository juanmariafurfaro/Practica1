package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;


@Entity
@Table(name = "Proovedor")
public class Proovedor {
    public Long getIdProovedor() {
        return idProovedor;
    }

    public void setIdProovedor(Long idProovedor) {
        this.idProovedor = idProovedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proovedor")
    private Long idProovedor;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "contacto")
    private String contacto;

    @Column(name = "direccion")
    private String direccion;

}
