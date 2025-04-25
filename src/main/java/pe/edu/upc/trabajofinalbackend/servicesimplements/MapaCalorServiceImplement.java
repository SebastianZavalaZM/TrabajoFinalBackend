package pe.edu.upc.trabajofinalbackend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinalbackend.entities.MapaCalor;
import pe.edu.upc.trabajofinalbackend.repositories.IMapaCalorRepository;
import pe.edu.upc.trabajofinalbackend.servicesinterfaces.IMapaCalorService;

import java.util.List;

@Service
public class MapaCalorServiceImplement implements IMapaCalorService {

    @Autowired
    private IMapaCalorRepository mR;

    @Override
    public List<MapaCalor> list() {
        return mR.findAll();
    }

    @Override
    public void insert(MapaCalor m) {
        mR.save(m);
    }

    @Override
    public MapaCalor listId(int id) {
        return mR.findById(id).orElse(new MapaCalor());
    }

    @Override
    public void update(MapaCalor m) {
        mR.save(m);
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }
}
