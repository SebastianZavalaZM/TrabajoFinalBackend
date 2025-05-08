package pe.edu.upc.trabajofinalbackend.dtos;

public class EstadisticasporusuariocalorDTO {
    private String name;
    private String correo;
    private int cantidad_registros;
    private double promedio_concentracion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCantidad_registros() {
        return cantidad_registros;
    }

    public void setCantidad_registros(int cantidad_registros) {
        this.cantidad_registros = cantidad_registros;
    }

    public double getPromedio_concentracion() {
        return promedio_concentracion;
    }

    public void setPromedio_concentracion(double promedio_concentracion) {
        this.promedio_concentracion = promedio_concentracion;
    }
}
