package pe.edu.upc.trabajofinalbackend.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "suportes")
public class Suporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsuporte;

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "titulo", length = 2000, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users users;

    public Suporte() {
    }

    public Suporte(Long idsuporte, String titulo, LocalDate fecha, String descripcion, Users users) {
        this.idsuporte = idsuporte;
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.users = users;
    }

    public Long getIdsuporte() {
        return idsuporte;
    }

    public void setIdsuporte(Long idsuporte) {
        this.idsuporte = idsuporte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users =users;
}
}