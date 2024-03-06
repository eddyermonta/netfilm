package org.example.netfilm.Persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "multimedia")
public class MultimediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_multimedia")
    private Long idMultimedia;

    /* @ManyToOne
     @JoinColumn(name = "id_perfil")
     private Perfil perfil;
     @OneToOne
     @JoinColumn(name = "id_fichatecnica")
     private FichaTecnica fichaTecnica;
     @ManyToOne
     @JoinColumn(name = "id_plan")
     private Plan plan;
       /* @OneToMany(mappedBy = "multimedia")
        private List<Genero> generos;    /*  */
    @OneToOne(mappedBy = "multimedia")
    private SerieEntity serie;
    @OneToOne(mappedBy = "multimedia")
    private SerieEntity pelicula;
    @OneToOne(mappedBy = "multimedia")
    private SerieEntity trailer;

    public MultimediaEntity(Long idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public MultimediaEntity() {

    }

    public Long getIdMultimedia() {
        return idMultimedia;
    }
}




