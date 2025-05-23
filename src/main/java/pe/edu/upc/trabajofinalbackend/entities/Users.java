package pe.edu.upc.trabajofinalbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")

public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsers;

    @Column(name = "username", nullable = false,length = 150, unique = true)
    private String username;
    @Column(name = "correo",nullable = false,length = 150)
    private String correo;
    @Column(name = "password",nullable = false,length = 200)
    private String password;
    @Column(name = "FechaRegistro",nullable = false)
    private LocalDate fecharegistro;
    @Column(name = "Ubicacion",nullable = false,length = 200)
    private String ubicacion;
    @Column(name = "LongitudUsuario",nullable = false)
    private double longitudUsuario;
    @Column(name = "LatitudUsuario",nullable = false)
    private double latitudUsuario;

    private Boolean enabled;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private List<Role> roles;

    public Users() {
    }

    public Users(int idUsers, String username, String correo, String password, LocalDate fecharegistro, String ubicacion, double longitudUsuario, double latitudUsuario, Boolean enabled, List<Role> roles) {
        this.idUsers = idUsers;
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.fecharegistro = fecharegistro;
        this.ubicacion = ubicacion;
        this.longitudUsuario = longitudUsuario;
        this.latitudUsuario = latitudUsuario;
        this.enabled = enabled;
        this.roles = roles;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDate fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getLongitudUsuario() {
        return longitudUsuario;
    }

    public void setLongitudUsuario(double longitudUsuario) {
        this.longitudUsuario = longitudUsuario;
    }

    public double getLatitudUsuario() {
        return latitudUsuario;
    }

    public void setLatitudUsuario(double latitudUsuario) {
        this.latitudUsuario = latitudUsuario;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}