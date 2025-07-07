package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Users;
import pe.edu.upc.trabajofinalbackend.repositories.IUserRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IUserService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImplement.class);

    @Autowired
    private IUserRepository uR;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Users> list() {
        logger.info("Listando todos los usuarios");
        return uR.findAll();
    }

    @Override
    public void insert(Users u) {
        if (!u.getPassword().startsWith("$2a$")) { // Verifica si ya está encriptado
            String encodedPassword = passwordEncoder.encode(u.getPassword());
            u.setPassword(encodedPassword);
        }
        logger.info("Insertando usuario: {}", u.getUsername());
        uR.save(u);
    }

    @Override
    public Users listId(int id) {
        logger.info("Buscando usuario con ID: {}", id);
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public void update(Users u) {
        if (!u.getPassword().startsWith("$2a$")) { // Evita doble encriptación
            String encodedPassword = passwordEncoder.encode(u.getPassword());
            u.setPassword(encodedPassword);
        }
        logger.info("Actualizando usuario con ID: {}", u.getIdUsers());
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        logger.warn("Eliminando usuario con ID: {}", id);
        uR.deleteById(id); }

    @Override
    public List<String[]> estadisticasporusuariocalor() {
        return uR.estadisticasporusuariocalor();
    }

    @Override
    public List<String[]> distribuciondesuscriptoresuruario() {
        return uR.distribuciondesuscriptoresuruario();
    }

}