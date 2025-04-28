package pe.edu.upc.trabajofinalbackend.dtos;
import pe.edu.upc.trabajofinalbackend.entities.Users;
import java.time.LocalDate;

public class SuporteDTO {
    private Long idsuporte;
    private String titulo;
    private LocalDate fecha;
    private String descripcion;
    private Users users;

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
