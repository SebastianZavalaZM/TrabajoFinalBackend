package pe.edu.upc.trabajofinalbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "foros", uniqueConstraints = {@UniqueConstraint(columnNames = {"users_id", "foro"})})
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descripcion;

    private LocalDate fechacreacion;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;


    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "foros_id")
    private List<CommentForum> comentarios;


    public Long getIdForo() { return id; }

    public void setIdForo(Long idForo) { this.id = id; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDate getFechacreacion() { return fechacreacion; }

    public void setFechacreacion(LocalDate fechacreacion) { this.fechacreacion = fechacreacion; }

    public Users getUsers() { return users; }

    public void setUsers(Users users) { this.users = users; }

    public List<CommentForum> getComentarios() { return comentarios; }

    public void setComentarios(List<CommentForum> comentarios) { this.comentarios = comentarios; }
}