package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.ArticuloInformativo;

import java.util.List;

@Repository
public interface IArticuloInformativoRepository extends JpaRepository<ArticuloInformativo, Integer> {
    @Query("SELECT a FROM ArticuloInformativo a WHERE a.users = :users_id")
    List<ArticuloInformativo> buscarPorUsuario();

    @Query("SELECT a FROM ArticuloInformativo a WHERE a.titulo LIKE :titulo OR a.contenido LIKE :titulo")
    List<ArticuloInformativo> buscarPorTituloOContenido(@Param("titulo") String keyword);

}
