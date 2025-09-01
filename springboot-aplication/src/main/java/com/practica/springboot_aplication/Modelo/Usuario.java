package com.practica.springboot_aplication.Modelo;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Usuario")
    private Long isUsuario;

    @Column(name = "Username",nullable = false)
    private String usuario;

    @Column(name = "Contrasenia",nullable = false)
    private String contrasenia;

    @OneToMany(mappedBy = "Usuario")
    private List<Cliente> clientes;

    public Long getIsUsuario() {
        return isUsuario;
    }

    public void setIsUsuario(Long isUsuario) {
        this.isUsuario = isUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Usuario() {    } 

}
