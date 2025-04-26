package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Role;
import pe.edu.upc.trabajofinalbackend.repositories.IRoleRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {

    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role rol) { rR.save(rol); }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) { rR.deleteById(idRol); }
}