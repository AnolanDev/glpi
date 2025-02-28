package com.antoscorp.glpi_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "glpi_computers")  // Nombre de la tabla en GLPI
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String serial;
    private String otherserial;
    private String comment;

}
