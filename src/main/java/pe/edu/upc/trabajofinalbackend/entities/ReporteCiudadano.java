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
    @Column(name="usuarioid",nullable = false,length = 100)
    private String users_id;

    public ReporteCiudadano(){}

    @ManyToOne
    @JoinColumn(name="users_id")
    private Users users;

    public ReporteCiudadano(int id, String tipodengue, LocalDate fechaReporte, String cuidad, String users_id, Users users) {
        this.id = id;
        this.tipodengue = tipodengue;
        this.fechaReporte = fechaReporte;
        this.cuidad = cuidad;
        this.users_id = users_id;
        this.users = users;
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

    public String getUsers_id() {
        return users_id;
    }

    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
