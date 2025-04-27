package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Enfermedad;
import java.util.List;

public interface IEnfermedadService {
    Enfermedad guardar(Enfermedad enfermedad);
    List<Enfermedad> listar();
}