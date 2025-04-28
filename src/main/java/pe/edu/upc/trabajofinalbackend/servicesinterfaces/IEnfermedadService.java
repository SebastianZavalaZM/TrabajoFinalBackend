//Aqui definimos que operaciones se pueden hacer con enfermedades: listar, buscar, registrar, modificar y eliminar.

package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import java.util.List;

public interface IEnfermedadService {
    public List<Enfermedad> list();
    public void insert(Enfermedad e);
    public Enfermedad listId(int id);
    public void update(Enfermedad e);
    public void delete(int id);
}