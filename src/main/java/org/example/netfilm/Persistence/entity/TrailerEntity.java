package org.example.netfilm.Persistence.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "trailer")
public class TrailerEntity {
    @Id
    @Column(name = "id_trailer")
    private Long idTrailer;
    @Column
    private String ruta;
    @Column
    private String duracion;
    @Column
    private String resolucion;
    @Column
    private boolean HDR;
    @OneToOne
    @JoinColumn(name = "id_multimedia", insertable = false, updatable = false)
    private MultimediaEntity multimedia;

    public TrailerEntity(Long idTrailer, String ruta, String duracion, String resolucion, boolean HDR) {
        this.idTrailer = idTrailer;
        this.ruta = ruta;
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.HDR = HDR;
    }

    public TrailerEntity() {

    }
}
