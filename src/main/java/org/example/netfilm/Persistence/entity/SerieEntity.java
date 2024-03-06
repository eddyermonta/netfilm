package org.example.netfilm.Persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "serie")
public class SerieEntity {
    @Id
    @Column(name = "id_serie")
    private Long idSerie;
    @OneToOne
    @JoinColumn(name = "id_multimedia",insertable = false, updatable = false)
    private MultimediaEntity multimedia;
    @Column
    private String ruta;
    @Column
    private String resolucion;
    @Column
    private boolean HDR;
    @OneToMany(mappedBy = "serie", cascade = {CascadeType.ALL})
    private List<TemporadaEntity> temporada;


    public SerieEntity(Long idSerie, String ruta, String resolucion, boolean HDR) {
        this.idSerie = idSerie;
        this.ruta = ruta;
        this.resolucion = resolucion;
        this.HDR = HDR;
    }

    public SerieEntity() {

    }

}
