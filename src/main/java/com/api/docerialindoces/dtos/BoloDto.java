package com.api.docerialindoces.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class BoloDto {

    @NotBlank
    private String massaBolo;

    @NotBlank
    @Size(max = 2)
    private  String kiloBolo;

    @NotBlank
    private String recheioBolo;

}
