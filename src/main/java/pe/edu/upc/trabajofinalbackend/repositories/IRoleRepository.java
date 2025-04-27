package pe.edu.upc.trabajofinalbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinalbackend.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    // Custom query methods can be defined here if needed
    // For example, you can add methods to find roles by specific criteria
    // or to perform complex queries using JPQL or native SQL.
}