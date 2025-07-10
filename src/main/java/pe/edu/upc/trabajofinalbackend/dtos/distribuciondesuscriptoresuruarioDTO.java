package pe.edu.upc.trabajofinalbackend.dtos;

public class distribuciondesuscriptoresuruarioDTO {

    private String name_suscription;
    private int cantidad;
    private double porcentaje;

    public String getName_suscription() {
        return name_suscription;
    }

    public void setName_suscription(String name_suscription) {
        this.name_suscription = name_suscription;
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
