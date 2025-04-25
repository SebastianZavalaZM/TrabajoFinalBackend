package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Suscription;
@Repository
public interface ISuscriptionRepository  extends JpaRepository<Suscription, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
