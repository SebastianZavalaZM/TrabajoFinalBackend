package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="reporteciudadano")
public class ReporteCiudadano {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private int id;
    @Column(name="tipodengue",nullable = false,length = 100)
    private String tipodengue;
    @Column(name="fechaReporte",nullable = false)
    private LocalDate fechaReporte;
    @Column(name="cuidad",nullable = false,length = 100)
    private String cuidad;

    public ReporteCiudadano(){}
    //USAR ESTE user_id PARA EL FK
    @ManyToOne
    @JoinColumn(name="users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name="enfermedad_id")
    private Enfermedad enfermedad;

    public ReporteCiudadano(int id, String tipodengue, LocalDate fechaReporte, String cuidad, Users users, Enfermedad enfermedad) {
        this.id = id;
        this.tipodengue = tipodengue;
        this.fechaReporte = fechaReporte;
        this.cuidad = cuidad;
        this.users = users;
        this.enfermedad = enfermedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipodengue() {
        return tipodengue;
    }

    public void setTipodengue(String tipodengue) {
        this.tipodengue = tipodengue;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }
}
