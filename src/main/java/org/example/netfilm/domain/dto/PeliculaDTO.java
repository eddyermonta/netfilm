package org.example.netfilm.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PeliculaDTO {
    @JsonIgnore
    private Long idPelicula;
    private String ruta;
    private String duracion;
    private String resolucion;
    private boolean HDR;
    @JsonIgnore
    private MultimediaDTO multimedia;

    public PeliculaDTO() {
    }

    public PeliculaDTO(String ruta, String duracion, String resolucion, boolean HDR) {
        this.ruta = ruta;
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.HDR = HDR;
    }

    public PeliculaDTO(Long idPelicula, String ruta, String duracion, String resolucion, boolean HDR) {
        this.idPelicula = idPelicula;
        this.ruta = ruta;
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.HDR = HDR;
    }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
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

    public MultimediaDTO getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(MultimediaDTO multimedia) {
        this.multimedia = multimedia;
    }
}
