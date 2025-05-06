package pe.edu.upc.trabajofinalbackend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {

}