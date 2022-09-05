package com.api.docerialindoces.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class ClienteDto {

    @NotBlank
    @Size(max = 10)
    private String cpfCliente;

    @NotBlank
    private  String enderecoCliente;

    @NotBlank
    private String nomeCliente;

    @NotBlank
    @Size(max = 11)
    private String telefoneCliente;

    @NotBlank
    private String emailCliente;

}
