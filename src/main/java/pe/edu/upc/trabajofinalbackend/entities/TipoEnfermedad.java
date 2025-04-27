package pe.edu.upc.trabajofinalbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class TipoEnfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;

    private String nombre;
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoEnfermedad", cascade = CascadeType.ALL)
    private List<Enfermedad> enfermedades;

    // Getters y Setters
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
}