package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Suscription;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.util.List;

public interface ISuscriptionService {
    public List<Suscription> list();
    public void insertar(Suscription s);
    public Suscription listId(int id);
    public void update(Suscription s);
    public void delete(int id);
}
