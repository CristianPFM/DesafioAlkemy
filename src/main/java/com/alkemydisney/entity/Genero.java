package com.alkemydisney.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombre;
    private String imagen;

    @OneToMany(mappedBy = "genero", fetch = FetchType.EAGER)
    private Set<Pelicula> peliculas = new HashSet<>();

}
