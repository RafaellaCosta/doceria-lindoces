package com.api.docerialindoces.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_DOCERIA_LINDOCES")
public class DoceriaLindocesModel implements Serializable {

    //relacionado a conversoes que vao ser realizadas por debaixo dos panos
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}