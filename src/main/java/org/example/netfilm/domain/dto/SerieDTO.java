package org.example.netfilm.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.example.netfilm.Persistence.entity.MultimediaEntity;
import org.example.netfilm.Persistence.entity.TemporadaEntity;

import java.util.List;

public class SerieDTO {
    @JsonIgnore
    private Long idSerie;
    @JsonIgnore
    private MultimediaEntity multimedia;
    private String ruta;
    private String resolucion;
    private boolean HDR;
    private List<TemporadaDTO> temporadaDTOS;

    public SerieDTO(String ruta, String resolucion, boolean HDR, List<TemporadaDTO> temporadaDTOS) {
        this.ruta = ruta;
        this.resolucion = resolucion;
        this.HDR = HDR;
        this.temporadaDTOS = temporadaDTOS;
    }

    public SerieDTO() {

    }

    public Long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Long idSerie) {
        this.idSerie = idSerie;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isHDR() {
        return HDR;
    }

    public void setHDR(boolean HDR) {
        this.HDR = HDR;
    }

    public List<TemporadaDTO> getTemporadaDTOS() {
        return temporadaDTOS;
    }

    public void setTemporadaDTOS(List<TemporadaDTO> temporadaDTOS) {
        this.temporadaDTOS = temporadaDTOS;
    }
}
