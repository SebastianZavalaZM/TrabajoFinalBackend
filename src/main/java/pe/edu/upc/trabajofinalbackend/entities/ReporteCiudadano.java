package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="reporteciudadano")
public class ReporteCiudadano {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private int idReporte;
    @Column(name="fechaReporte",nullable = false)
    private LocalDate fechaReporte;
    @Column(name="ciudad",nullable = false,length = 100)
    private String ciudad;

    public ReporteCiudadano(){}
    //USAR ESTE user_id PARA EL FK
    @ManyToOne
    @JoinColumn(name="users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name="enfermedad_id")
    private Enfermedad enfermedad;

    public ReporteCiudadano(int idReporte, LocalDate fechaReporte, String cuidad, Users users, Enfermedad enfermedad) {
        this.idReporte = idReporte;
        this.fechaReporte = fechaReporte;
        this.ciudad = cuidad;
        this.users = users;
        this.enfermedad = enfermedad;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getCuidad() {
        return ciudad;
    }

    public void setCuidad(String cuidad) {
        this.ciudad = cuidad;
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
