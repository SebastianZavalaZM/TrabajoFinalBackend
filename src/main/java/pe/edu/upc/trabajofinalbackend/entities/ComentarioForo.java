package pe.edu.upc.trabajofinalbackend.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
public class ComentarioForo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    private String contenido;
    private LocalDateTime fechaComentario;
    private int foroId;
    private int usuarioId;

    public ComentarioForo() {}

    public int getIdComentario() {
        return idComentario;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDateTime fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public int getForoId() {
        return foroId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
