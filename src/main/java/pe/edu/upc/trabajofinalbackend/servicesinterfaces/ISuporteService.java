package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.Suporte;

import java.time.LocalDate;
import java.util.List;


public interface ISuporteService {
    public List<Suporte> list();
    public void insertar(Suporte suporte);
    public Suporte listId(Long id);
    public void update(Suporte suporte);
    public void delete(Long id);

    public List<Suporte> buscarPorRangoDeFechas(LocalDate startDate, LocalDate endDate);
    public List<Suporte> buscarPorUsuarioId(Long idUsuario);

}
