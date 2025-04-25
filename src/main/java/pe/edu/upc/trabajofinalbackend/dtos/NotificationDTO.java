package pe.edu.upc.trabajofinalbackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.trabajofinalbackend.entities.MapaCalor;

import java.time.LocalDate;

public class NotificationDTO {

    private int idnotification;
    private String mensaje;
    private LocalDate fechaenvio;
    private String tipo;
    private String origen;

    private MapaCalor mapacalor;

    public int getIdnotification() {
        return idnotification;
    }

    public void setIdnotification(int idnotification) {
        this.idnotification = idnotification;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(LocalDate fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public MapaCalor getMapacalor() {
        return mapacalor;
    }

    public void setMapacalor(MapaCalor mapacalor) {
        this.mapacalor = mapacalor;
    }
}
