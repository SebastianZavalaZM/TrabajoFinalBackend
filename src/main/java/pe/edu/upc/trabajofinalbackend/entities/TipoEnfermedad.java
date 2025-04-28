package pe.edu.upc.trabajofinalbackend.entities;
import jakarta.persistence.*;


@Entity
@Table(name = "tipoenfermedad")
public class TipoEnfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 2000, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users users;

    public TipoEnfermedad() {
    }

    public TipoEnfermedad(int idTipo, String nombre, String descripcion, Users users) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.users = users;
    }

    // Getters y Setters

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        this.users = users;
    }
}