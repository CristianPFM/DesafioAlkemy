package com.alkemydisney.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<Pelicula> peliculas = new ArrayList<>();

}
