package org.example.netfilm.Persistence.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "pelicula")
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long idPelicula;
    @OneToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_multimedia")
    private MultimediaEntity multimedia;
    @Column
    private String ruta;
    @Column
    private String duracion;
    @Column
    private String resolucion;
    @Column
    private boolean HDR;


    public PeliculaEntity(Long idPelicula, MultimediaEntity multimedia, String ruta, String duracion, String resolucion, boolean HDR) {
        this.idPelicula = idPelicula;
        this.multimedia = multimedia;
        this.ruta = ruta;
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.HDR = HDR;
    }


    public PeliculaEntity() {

    }

    public PeliculaEntity(MultimediaEntity multimedia, String ruta, String duracion, String resolucion, boolean HDR) {
        this.multimedia = multimedia;
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

    public MultimediaEntity getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(MultimediaEntity multimedia) {
        this.multimedia = multimedia;
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
