package pe.edu.upc.trabajofinalbackend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Users;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {

}
