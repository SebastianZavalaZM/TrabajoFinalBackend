package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CommentForum")
public class CommentForum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommentForum;

    @Column(name = "comentario", length = 100, nullable = false)
    private String contenidoCommentForum;

    @Column(name = "fechacomentario", nullable = false)
    private LocalDate fechaComentarioCommnetForum;

    @ManyToOne
    @JoinColumn(name = "idforum")
    private Forum Forum;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users Users;

    public CommentForum() {
    }

    public CommentForum(int idCommentForum, String contenidoCommentForum, LocalDate fechaComentarioCommnetForum, Forum forum, Users users) {
        this.idCommentForum = idCommentForum;
        this.contenidoCommentForum = contenidoCommentForum;
        this.fechaComentarioCommnetForum = fechaComentarioCommnetForum;
        Forum = forum;
        Users = users;
    }

    public int getIdCommentForum() {
        return idCommentForum;
    }

    public void setIdCommentForum(int idCommentForum) {
        this.idCommentForum = idCommentForum;
    }

    public String getContenidoCommentForum() {
        return contenidoCommentForum;
    }

    public void setContenidoCommentForum(String contenidoCommentForum) {
        this.contenidoCommentForum = contenidoCommentForum;
    }

    public LocalDate getFechaComentarioCommnetForum() {
        return fechaComentarioCommnetForum;
    }

    public void setFechaComentarioCommnetForum(LocalDate fechaComentarioCommnetForum) {
        this.fechaComentarioCommnetForum = fechaComentarioCommnetForum;
    }

    public Forum getForum() {
        return Forum;
    }

    public void setForum(Forum forum) {
        Forum = forum;
    }

    public Users getUsers() {
        return Users;
    }

    public void setUsers(Users users) {
        Users = users;
    }
}