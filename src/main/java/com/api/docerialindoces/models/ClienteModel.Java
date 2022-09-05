package com.api.docerialindoces.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class ClienteModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String cpfCliente;

    @Column(nullable = false, length = 120)
    private String enderecoCliente;

    @Column(nullable = false, length = 120)
    private String nomeCliente;

    @Column(nullable = false, unique = true, length = 11)
    private String telefoneCliente;

    @Column(nullable = false, unique = true, length = 110)
    private String emailCliente;

}
