package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "mapacalor")
public class MapaCalor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmapacalor;

    @Column(name = "latitud", nullable = false)
    private double latitud;

    @Column(name = "longitud", nullable = false)
    private double longitud;

    @Column(name = "nivelriesgo", nullable = false, length = 20)
    private String nivelriesgo;

    @Column(name = "fechacreacion", nullable = false)
    private LocalDate fechaactualizacion;

    @Column(name = "concentraciondecalor", nullable = false)
    private double concentraciondecalor;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users users;

    public MapaCalor() {
    }

    public MapaCalor(int idmapacalor, double latitud, double longitud, String nivelriesgo, LocalDate fechaactualizacion, double concentraciondecalor, Users users) {
        this.idmapacalor = idmapacalor;
        this.latitud = latitud;
        this.longitud = longitud;
        this.nivelriesgo = nivelriesgo;
        this.fechaactualizacion = fechaactualizacion;
        this.concentraciondecalor = concentraciondecalor;
        this.users = users;
    }

    public int getIdmapacalor() {
        return idmapacalor;
    }

    public void setIdmapacalor(int idmapacalor) {
        this.idmapacalor = idmapacalor;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getNivelriesgo() {
        return nivelriesgo;
    }

    public void setNivelriesgo(String nivelriesgo) {
        this.nivelriesgo = nivelriesgo;
    }

    public LocalDate getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(LocalDate fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    public double getConcentraciondecalor() {
        return concentraciondecalor;
    }

    public void setConcentraciondecalor(double concentraciondecalor) {
        this.concentraciondecalor = concentraciondecalor;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
