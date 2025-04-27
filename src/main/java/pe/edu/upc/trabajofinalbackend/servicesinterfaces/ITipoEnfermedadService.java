package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import java.util.List;

public interface ITipoEnfermedadService {
    TipoEnfermedad guardar(TipoEnfermedad tipoEnfermedad);
    List<TipoEnfermedad> listar();
}