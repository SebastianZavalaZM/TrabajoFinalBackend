package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"users_id", "rol"})})
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rol;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUser() {
        return users;
    }
    public void setUser(Users users) {
        this.users = users;
    }
}