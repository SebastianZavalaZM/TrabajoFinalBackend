package pe.edu.upc.trabajofinalbackend.dtos;

import java.time.LocalDate;

import pe.edu.upc.trabajofinalbackend.entities.Forum;
import pe.edu.upc.trabajofinalbackend.entities.Users;

public class CommentForumDTO {

    private int id;
    private Forum forums;
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