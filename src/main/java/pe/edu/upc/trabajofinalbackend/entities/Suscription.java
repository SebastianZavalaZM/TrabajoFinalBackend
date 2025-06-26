package pe.edu.upc.trabajofinalbackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "suscription")
public class Suscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscription;

    @Column(name = "nameSuscription", length = 30, nullable = false)
    private String nameSuscription;

    @Column(name = "descriptionSuscription", length = 100, nullable = false)
    private String descriptionSuscription;

    @Column(name = "startDateSuscription", nullable = false)
    private LocalDate startDateSuscription;

    @Column(name = "endDateSuscription", nullable = false)
    private LocalDate endDateSuscription;

    @ManyToOne
    @JoinColumn(name = "users_id")//idUsers
    private Users users;

    public Suscription() {
    }

    public Suscription(int idSuscription, String nameSuscription, String descriptionSuscription, LocalDate startDateSuscription, LocalDate endDateSuscription, Users users) {
        this.idSuscription = idSuscription;
        this.nameSuscription = nameSuscription;
        this.descriptionSuscription = descriptionSuscription;
        this.startDateSuscription = startDateSuscription;
        this.endDateSuscription = endDateSuscription;
        this.users = users;
    }

    public int getIdSuscription() {
        return idSuscription;
    }

    public void setIdSuscription(int idSuscription) {
        this.idSuscription = idSuscription;
    }

    public String getNameSuscription() {
        return nameSuscription;
    }

    public void setNameSuscription(String nameSuscription) {
        this.nameSuscription = nameSuscription;
    }

    public String getDescriptionSuscription() {
        return descriptionSuscription;
    }

    public void setDescriptionSuscription(String descriptionSuscription) {
        this.descriptionSuscription = descriptionSuscription;
    }

    public LocalDate getStartDateSuscription() {
        return startDateSuscription;
    }

    public void setStartDateSuscription(LocalDate startDateSuscription) {
        this.startDateSuscription = startDateSuscription;
    }

    public LocalDate getEndDateSuscription() {
        return endDateSuscription;
    }

    public void setEndDateSuscription(LocalDate endDateSuscription) {
        this.endDateSuscription = endDateSuscription;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
