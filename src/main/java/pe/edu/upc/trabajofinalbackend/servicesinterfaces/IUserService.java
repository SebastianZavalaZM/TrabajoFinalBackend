package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> list();
    public void insert(Users user);
    public Users listId(int id);
    public void update(Users user);
    public void delete(int id);
}