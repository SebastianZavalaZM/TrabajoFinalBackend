package pe.edu.upc.trabajofinalbackend.dtos;
import pe.edu.upc.trabajofinalbackend.entities.Users;
import java.time.LocalDate;

public class MapaCalorDTO {

    private int idmapacalor;
    private double latitud;
    private double longitud;
    private String nivelriesgo;
    private LocalDate fechaactualizacion;
    private double concentraciondecalor;
    private Users users;

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
