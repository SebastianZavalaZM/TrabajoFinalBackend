//Este archivo define que operaciones se pueden hacer con tipos de enfermedad: listar, buscar, registrar, modificar, eliminar, buscar por palabra y contar.

package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.TipoEnfermedad;
import java.util.List;

public interface ITipoEnfermedadService {
    public List<TipoEnfermedad> list();
    public void insert(TipoEnfermedad t);
    public TipoEnfermedad listId(int id);
    public void update(TipoEnfermedad t);
    public void delete(int id);

    //NUEVOS QUERIES
    public List<TipoEnfermedad> buscarPorNombreContiene(String palabra);
    public Long contarTiposDeEnfermedad();
}
