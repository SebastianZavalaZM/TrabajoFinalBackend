package pe.edu.upc.trabajofinalbackend.dtos;

public class EnfermedadNivelRiesgoDTO {
    private String nivelRiesgo;
    private long cantidad;

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
}