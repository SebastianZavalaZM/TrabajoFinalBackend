package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.MapaCalor;

import java.util.List;

public interface IMapaCalorService {
    public List<MapaCalor> list();
    public void insert(MapaCalor m);
    public MapaCalor listId(int id);
    public void update(MapaCalor m);
    public void delete(int id);
}
