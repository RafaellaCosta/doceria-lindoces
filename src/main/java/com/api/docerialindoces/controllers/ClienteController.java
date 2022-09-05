package com.api.docerialindoces.controllers;


import com.api.docerialindoces.dtos.ClienteDto;
import com.api.docerialindoces.services.ClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.api.docerialindoces.models.ClienteModel;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cliente")
public class ClienteController {

    final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody @Valid ClienteDto clienteDto) {
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        clienteModel.setCpfCliente("456056460987");
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(clienteModel));
    }
}
