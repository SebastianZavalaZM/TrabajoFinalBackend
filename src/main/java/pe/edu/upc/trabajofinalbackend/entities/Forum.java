package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Foros")
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idforum;

    @Column(name = "titulo", length = 150, nullable = false)
    private String titulo;

    @Column(name = "descripcion", length = 150, nullable = false)
    private String descripcion;

    @Column(name = "fechacreacion", nullable = false)
    private LocalDate fechacreacion;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users Users;

    public Forum() {
    }

    public Forum(int idforum, String titulo, String descripcion, LocalDate fechacreacion, Users users) {
        this.idforum = idforum;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechacreacion = fechacreacion;
        Users = users;
    }

    public int getIdforum() {
        return idforum;
    }

    public void setIdforum(int idforum) {
        this.idforum = idforum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Users getUsers() {
        return Users;
    }

    public void setUsers(Users users) {
        Users = users;
    }
}