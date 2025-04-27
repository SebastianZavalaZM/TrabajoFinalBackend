package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.dtos.SuporteDTO;
import pe.edu.upc.trabajofinalbackend.entities.Suporte;
import pe.edu.upc.trabajofinalbackend.repositories.ISuporteRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.ISuporteService;

import java.util.List;
import java.util.Optional;

@Service
public class SuporteServiceImplement implements ISuporteService{
    @Autowired
    private ISuporteRepository suporteRepository;

    @Override
    public Suporte save(SuporteDTO suporteDTO) {
        Suporte suporte = new Suporte();
        suporte.setTitulo(suporteDTO.getTitulo());
        suporte.setDescripcion(suporteDTO.getDescripcion());
        return suporteRepository.save(suporte);
    }

    @Override
    public List<Suporte> findAll() {
        return suporteRepository.findAll();
    }

    @Override
    public Optional<Suporte> findById(Long id) {
        return suporteRepository.findById(id);
    }

    @Override
    public Suporte update(Long id, SuporteDTO suporteDTO) {
        Optional<Suporte> suporteOptional = suporteRepository.findById(id);

        if (suporteOptional.isPresent()) {
            Suporte suporteToUpdate = suporteOptional.get();
            suporteToUpdate.setTitulo(suporteDTO.getTitulo());
            suporteToUpdate.setDescripcion(suporteDTO.getDescripcion());
            return suporteRepository.save(suporteToUpdate);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        suporteRepository.deleteById(id);
    }

}


