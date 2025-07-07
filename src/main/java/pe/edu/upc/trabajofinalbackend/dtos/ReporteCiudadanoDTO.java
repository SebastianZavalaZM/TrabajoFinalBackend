package pe.edu.upc.trabajofinalbackend.dtos;

import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.time.LocalDate;

public class ReporteCiudadanoDTO {

    private int idReporte;
    private LocalDate fechaReporte;
    private String ciudad;
    private Users users;
    private Enfermedad enfermedad;

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
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
}
