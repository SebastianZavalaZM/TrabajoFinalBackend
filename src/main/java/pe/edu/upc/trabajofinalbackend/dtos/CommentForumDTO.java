package pe.edu.upc.trabajofinalbackend.dtos;

import java.time.LocalDate;

import pe.edu.upc.trabajofinalbackend.entities.Forum;
import pe.edu.upc.trabajofinalbackend.entities.Users;

public class CommentForumDTO {

    private int idCommentForum;

    private String contenidoCommentForum;

    private LocalDate fechaComentarioCommnetForum;

    private Forum Forum;

    private Users Users;

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