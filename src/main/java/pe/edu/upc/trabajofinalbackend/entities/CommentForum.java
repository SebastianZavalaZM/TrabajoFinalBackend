package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comentariosforos", uniqueConstraints = {@UniqueConstraint(columnNames = {"users_id", "foros_id", "comentario"})})
public class CommentForum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "foros_id", nullable = false)
    private Forum forums;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;


    private String contenido;

    private LocalDate fechaComentario;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Forum getForums() { return forums; }

    public void setForums(Forum forums) { this.forums = forums; }

    public Users getUsers() { return users; }

    public void setUsers(Users users) { this.users = users; }

    public String getContenido() { return contenido; }

    public void setContenido(String contenido) { this.contenido = contenido; }

    public LocalDate getFechaComentario() { return fechaComentario; }

    public void setFechaComentario(LocalDate fechaComentario) { this.fechaComentario = fechaComentario; }
}