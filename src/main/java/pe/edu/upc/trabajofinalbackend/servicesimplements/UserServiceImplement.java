package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Users;
import pe.edu.upc.trabajofinalbackend.repositories.IUserRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users u) { uR.save(u); }

    @Override
    public Users listId(int id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public void update(Users u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) { uR.deleteById(id); }

}
