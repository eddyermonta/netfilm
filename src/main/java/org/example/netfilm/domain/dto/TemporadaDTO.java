package org.example.netfilm.domain.dto;

import java.util.Date;
import java.util.List;

public class TemporadaDTO {
    private Long numeroTemporada;
    private String nombre;
    private int cantidadCapitulos;
    private Date anoLanzamiento;
    private List<CapituloDTO> capituloDTOS;

    public TemporadaDTO(String nombre, int cantidadCapitulos, Date anoLanzamiento, List<CapituloDTO> capituloDTOS) {
        this.nombre = nombre;
        this.cantidadCapitulos = cantidadCapitulos;
        this.anoLanzamiento = anoLanzamiento;
        this.capituloDTOS = capituloDTOS;
    }

    public Long getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(Long numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    public void setCantidadCapitulos(int cantidadCapitulos) {
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public Date getAnoLanzamiento() {
        return anoLanzamiento;
    }
    public void setAnoLanzamiento(Date anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public List<CapituloDTO> getCapituloDTOS() {
        return capituloDTOS;
    }

    public void setCapituloDTOS(List<CapituloDTO> capituloDTOS) {
        this.capituloDTOS = capituloDTOS;
    }
}
