package pe.edu.upc.trabajofinalbackend.dtos;

import java.time.LocalDate;
import java.util.List;

import pe.edu.upc.trabajofinalbackend.entities.CommentForum;
import pe.edu.upc.trabajofinalbackend.entities.Users;

public class ForumDTO {
    private Long id;
    private String titulo;
    private String descripcion;
    private LocalDate fechacreacion;
    private Users users;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDate getFechacreacion() { return fechacreacion; }

    public void setFechacreacion(LocalDate fechacreacion) { this.fechacreacion = fechacreacion; }

    public Users getUsers() { return users; }

    public void setUsers(Users users) { this.users = users; }
}