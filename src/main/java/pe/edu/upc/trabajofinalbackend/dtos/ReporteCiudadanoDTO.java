package pe.edu.upc.trabajofinalbackend.dtos;

import java.time.LocalDate;

public class ReporteCiudadanoDTO {

    private int id;
    private String tipodengue;
    private LocalDate fechaReporte;
    private String cuidad;
    private String users_id;

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
}
