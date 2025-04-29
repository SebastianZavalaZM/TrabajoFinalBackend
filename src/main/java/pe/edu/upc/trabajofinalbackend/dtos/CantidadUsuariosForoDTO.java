package pe.edu.upc.trabajofinalbackend.dtos;

public class CantidadUsuariosForoDTO {

    private Integer idforum;
    private String titulo;
    private Long cantidadUsuarios;

    public CantidadUsuariosForoDTO(Integer idforum, String titulo, Long cantidadUsuarios) {
        this.idforum = idforum;
        this.titulo = titulo;
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public Integer getIdforum() {
        return idforum;
    }

    public void setIdforum(Integer idforum) {
        this.idforum = idforum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(Long cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }
}
