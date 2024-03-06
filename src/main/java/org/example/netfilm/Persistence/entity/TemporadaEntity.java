package org.example.netfilm.Persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "temporada")
public class TemporadaEntity {
    @Id
    @Column(name = "id_temporada")
    private Long numeroTemporada;
    @ManyToOne
    @JoinColumn (name = "id_serie", updatable = false, insertable = false)
    private SerieEntity serie;
    private String nombre;
    @Column(name = "numero_capitulos")
    private int cantidadCapitulos;
    @Column (name = "ano_lanzamiento")
    private Date anoLanzamiento;
    @OneToMany(mappedBy = "temporada",cascade = {CascadeType.ALL})
    private List<CapituloEntity> capitulo;


    public TemporadaEntity(Long numeroTemporada, String nombre, int cantidadCapitulos, Date anoLanzamiento) {
        this.numeroTemporada = numeroTemporada;
        this.nombre = nombre;
        this.cantidadCapitulos = cantidadCapitulos;
        this.anoLanzamiento = anoLanzamiento;
    }

    public TemporadaEntity() {

    }

}
