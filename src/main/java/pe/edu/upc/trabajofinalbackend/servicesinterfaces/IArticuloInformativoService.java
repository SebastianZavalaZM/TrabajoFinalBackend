package pe.edu.upc.trabajofinalbackend.servicesinterfaces;

import pe.edu.upc.trabajofinalbackend.entities.ArticuloInformativo;

import java.util.List;

public interface IArticuloInformativoService {

    public List<ArticuloInformativo> list();
    public void insert(ArticuloInformativo articuloInformativo);
    public ArticuloInformativo listId(int id);
    public void update(ArticuloInformativo articuloInformativo);
    public void delete(int id);

    List<ArticuloInformativo> listConReportes();
    List<ArticuloInformativo> buscarPorContenidoDeReportes(String keyword);
}
