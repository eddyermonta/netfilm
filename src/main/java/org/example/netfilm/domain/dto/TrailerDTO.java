package org.example.netfilm.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TrailerDTO {
    @JsonIgnore
    private Long idTrailer;

    private String ruta;

    private String duracion;

    private String resolucion;

    private boolean HDR;

    public TrailerDTO(String ruta, String duracion, String resolucion, boolean HDR) {
        this.ruta = ruta;
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.HDR = HDR;
    }

    public Long getIdTrailer() {
        return idTrailer;
    }

    public void setIdTrailer(Long idTrailer) {
        this.idTrailer = idTrailer;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
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
}
