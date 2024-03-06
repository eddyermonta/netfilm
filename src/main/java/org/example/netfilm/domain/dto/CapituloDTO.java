package org.example.netfilm.domain.dto;



public class CapituloDTO {

    private Long numeroCapitulo;
    private String nombre;
    private String duracion;

    public CapituloDTO(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Long getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(Long numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
