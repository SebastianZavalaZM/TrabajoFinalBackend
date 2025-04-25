package pe.edu.upc.trabajofinalbackend.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idnotification;

    @Column(name ="mensaje", length = 100, nullable = false)
    private String mensaje;

    @Column(name = "fechaenvio", nullable = false)
    private LocalDate fechaenvio;

    @Column(name = "tipo", length = 20, nullable = false)
    private String tipo;

    @Column(name = "origen", length = 20, nullable = false)
    private String origen;


    @ManyToOne
    @JoinColumn(name = "idmapacalor")
    private MapaCalor mapacalor;

    public Notification() {
    }

    public Notification(int idnotification, String mensaje, LocalDate fechaenvio, String tipo, String origen, MapaCalor mapacalor) {
        this.idnotification = idnotification;
        this.mensaje = mensaje;
        this.fechaenvio = fechaenvio;
        this.tipo = tipo;
        this.origen = origen;
        this.mapacalor = mapacalor;
    }

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
