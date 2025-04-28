package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnfermedad;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "sintomas", nullable = false, length = 100)
    private String sintomas;
    @Column(name = "nivel_riesgo", nullable = false, length = 20)
    private String nivelRiesgo;

    @ManyToOne
    @JoinColumn(name = "tipo_enfermedad_id") // corregido el nombre
    private TipoEnfermedad tipoEnfermedad;

    public Enfermedad() {
    }

    public Enfermedad(int idEnfermedad, String nombre, String sintomas, String nivelRiesgo, TipoEnfermedad tipoEnfermedad) {
        this.idEnfermedad = idEnfermedad;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.nivelRiesgo = nivelRiesgo;
        this.tipoEnfermedad = tipoEnfermedad;
    }

    // Getters y Setters

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public TipoEnfermedad getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }
}