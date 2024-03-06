package org.example.netfilm.Persistence.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "capitulo")
public class CapituloEntity {
    @Id
    @Column (name = "id_captulo")
    private Long numeroCapitulo;
    @ManyToOne
    @JoinColumn(name = "id_temporada",insertable = false,updatable = false)
    private TemporadaEntity temporada;
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "duracion")
    private String duracion;

    public CapituloEntity(Long numeroCapitulo, String nombre, String duracion) {
        this.numeroCapitulo = numeroCapitulo;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public CapituloEntity() {

    }
}
