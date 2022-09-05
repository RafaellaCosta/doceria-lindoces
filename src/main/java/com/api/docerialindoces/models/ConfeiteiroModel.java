package com.api.docerialindoces.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_CONFEITEIRO")
public class ConfeiteiroModel implements Serializable {

    //relacionado a conversoes que vao ser realizadas por debaixo dos panos
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String idConfeiteiro;

    @Column(nullable = false, length = 120)
    private String nomeConfeiteiro;

    @Column(nullable = false, unique = true, length = 10)
    private String cpfConfeiteiro;

    @Column(nullable = false, unique = true, length = 11)
    private String telefoneConfeiteiro;

    @Column(nullable = false, unique = true, length = 110)
    private String emailConfeiteiro;

    @Column(nullable = false)
    private LocalDateTime dataRegistro;

}