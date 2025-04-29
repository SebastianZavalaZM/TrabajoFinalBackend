package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comentariosforos")
public class CommentForum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "comentario", length = 1000, nullable = false)
    private String contenido;
    @Column(name = "fechacomentario", nullable = false)
    private LocalDate fechaComentario;

    @ManyToOne
    @JoinColumn(name = "idforum")
    private Forum forums;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public CommentForum() {
    }

    public CommentForum(int id, String contenido, LocalDate fechaComentario, Forum forums, Users users) {
        this.id = id;
        this.contenido = contenido;
        this.fechaComentario = fechaComentario;
        this.forums = forums;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Forum getForums() {
        return forums;
    }

    public void setForums(Forum forums) {
        this.forums = forums;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}