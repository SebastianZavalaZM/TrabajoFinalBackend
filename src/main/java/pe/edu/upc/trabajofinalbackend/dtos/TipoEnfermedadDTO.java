//Es el archivo que sirve para enviar y recibir solo los datos necesarios de un tipo de enfermedad. No incluye la lista de enfermedades.


package pe.edu.upc.trabajofinalbackend.dtos;

import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import pe.edu.upc.trabajofinalbackend.entities.Users;

public class TipoEnfermedadDTO {

    private int idTipo;
    private String nombre;
    private String descripcion;
    private Users users;

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