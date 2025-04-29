package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="articuloinformativo")
public class ArticuloInformativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArticulo;
    @Column(name="titulo",nullable = false,length = 100)
    private String titulo;
    @Column(name="contenido",nullable = false,length = 2000)
    private String contenido;
    @Column(name="fechaPublicacion",nullable = false,length = 100)
    private LocalDate fechaPublicacion;
    @Column(name="fuente",nullable = false,length = 100)
    private String fuente;
    //IGNORAR
    @Column(name="usuarioid",length = 100)
    private String users_id;

    public ArticuloInformativo(){}

    //USAR ESTE user_id PARA EL USUARIO QUE CREA EL ARTICULO
    @ManyToOne
    @JoinColumn(name="users_id")
    private Users users;

    public ArticuloInformativo(int idArticulo, String titulo, String contenido, LocalDate fechaPublicacion, String fuente, String users_id, Users users) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.fuente = fuente;
        this.users_id = users_id;
        this.users = users;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getUsers_id() {
        return users_id;
    }

    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
