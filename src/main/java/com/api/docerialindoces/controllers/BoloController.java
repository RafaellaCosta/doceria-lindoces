package com.api.docerialindoces.controllers;

import com.api.docerialindoces.dtos.BoloDto;
import com.api.docerialindoces.services.BoloService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.api.docerialindoces.models.BoloModel;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/bolo")
public class BoloController {
    final BoloService boloService;

    public BoloController(BoloService boloService) {
        this.boloService = boloService;
    }

    @PostMapping
    public ResponseEntity<Object> saveBolo(@RequestBody @Valid BoloDto boloDto) {
        var boloModel = new BoloModel();
        BeanUtils.copyProperties(boloDto, boloModel);
        boloModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(boloService.save(boloModel));
    }

}










