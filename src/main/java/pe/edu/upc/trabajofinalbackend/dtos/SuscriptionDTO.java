package pe.edu.upc.trabajofinalbackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.trabajofinalbackend.entities.Users;

import java.time.LocalDate;

public class SuscriptionDTO {

    private int idSuscription;
    private String nameSuscription;
    private String descriptionSuscription;
    private LocalDate startDateSuscription;
    private LocalDate endDateSuscription;
    private Users users;

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
