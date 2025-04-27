package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

@Entity
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnfermedad;

    private String nombre;
    private String sintomas;
    private String nivelRiesgo;

    @ManyToOne
    @JoinColumn(name = "tipo_enfermedad_id") // corregido el nombre
    private TipoEnfermedad tipoEnfermedad;

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