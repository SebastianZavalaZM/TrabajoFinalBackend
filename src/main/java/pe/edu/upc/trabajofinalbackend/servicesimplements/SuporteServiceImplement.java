package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;
import pe.edu.upc.trabajofinalbackend.repositories.ISuporteRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ISuporteService;

import java.util.List;
import java.time.LocalDate;

@Service
public class SuporteServiceImplement implements ISuporteService {

    @Autowired
    private ISuporteRepository suporteRepository;

    @Override
    public List<Suporte> list() {
        return suporteRepository.findAll();
    }

    @Override
    public void insertar(Suporte suporte) {
        suporteRepository.save(suporte);
    }

    @Override
    public Suporte listId(Long id) {
        return suporteRepository.findById(id).orElse(new Suporte());
    }

    @Override
    public void update(Suporte suporte) {
        suporteRepository.save(suporte);
    }

    @Override
    public void delete(Long id) {
        suporteRepository.deleteById(id);
    }

    @Override
    public List<Suporte> buscarPorRangoDeFechas(LocalDate startDate, LocalDate endDate) {
        return suporteRepository.findByFechaBetween(startDate, endDate);
    }

    @Override
    public List<Suporte> buscarPorUsuarioId(Long idUsuario) {
        return suporteRepository.findByUsuarioId(idUsuario);
    }

}



