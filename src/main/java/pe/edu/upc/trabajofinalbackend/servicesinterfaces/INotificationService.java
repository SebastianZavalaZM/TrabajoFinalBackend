package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Notification;

import java.util.List;

public interface INotificationService {
    public List<Notification> list();
    public void insert(Notification n);
    public Notification listId(int id);
    public void update(Notification n);
    public void delete(int id);
}
