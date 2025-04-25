package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Notification;
import pe.edu.upc.trabajofinalbackend.repositories.INotificationRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.INotificationService;

import java.util.List;

@Service
public class NotiificationServiceImplement implements INotificationService {

    @Autowired
    private INotificationRepository nS;

    @Override
    public List<Notification> list() {
        return nS.findAll();
    }

    @Override
    public void insert(Notification n) {
        nS.save(n);
    }

    @Override
    public Notification listId(int id) {
        return nS.findById(id).orElse(new Notification());
    }

    @Override
    public void update(Notification n) {
        nS.save(n);
    }

    @Override
    public void delete(int id) {
        nS.deleteById(id);
    }
}
