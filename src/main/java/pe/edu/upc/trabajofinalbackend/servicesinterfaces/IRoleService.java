package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert (Role rol);
    public List<Role> list();
    public void delete (Long idRol);

}
