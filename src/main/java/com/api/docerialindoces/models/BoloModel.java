package com.api.docerialindoces.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_BOLO")
public class BoloModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 20)
    private String massaBolo;

    @Column(nullable = false, unique = true, length = 2)
    private String kiloBolo;

    @Column(nullable = false, unique = true, length = 30)
    private String recheioBolo;

    @Column(nullable = false)
    private LocalDateTime dataRegistro;

}