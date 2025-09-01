package com.practica.springboot_aplication.Modelo;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Muchos empleados pueden tener un mismo jefe
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_jefe", referencedColumnName = "id_empleado") // FK en esta tabla
    private Empleado jefe;

    // Lado inverso: un jefe tiene muchos subordinados
    @OneToMany(mappedBy = "jefe", fetch = FetchType.LAZY)
    private List<Empleado> subordinados = new ArrayList<>();

    @OneToMany(mappedBy = "empleado")
    private List<Orden> ordenes;

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(List<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public Empleado() {}

}
