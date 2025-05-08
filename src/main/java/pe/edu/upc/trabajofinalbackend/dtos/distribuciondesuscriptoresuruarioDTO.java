package pe.edu.upc.trabajofinalbackend.dtos;

public class distribuciondesuscriptoresuruarioDTO {

    private String name_susxription;
    private int cantidad;
    private double porcentaje;

    public String getName_susxription() {
        return name_susxription;
    }

    public void setName_susxription(String name_susxription) {
        this.name_susxription = name_susxription;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
