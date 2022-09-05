package com.api.docerialindoces.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class ConfeiteiroDto {

    @NotBlank
    @Size(max = 10)
    private String cpfConfeiteiro;

    @NotBlank
    private  String nomeConfeiteiro;

    @NotBlank
    private String nomeCliente;

    @NotBlank
    @Size(max = 11)
    private String telefoneConfeiteiro;

    @NotBlank
    private String emailConfeiteiro;
}
