package com.api.docerialindoces.controllers;

import com.api.docerialindoces.dtos.ConfeiteiroDto;
import com.api.docerialindoces.models.ConfeiteiroModel;
import com.api.docerialindoces.services.ConfeiteiroService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/confeiteiro")
public class ConfeiteiroController {

    final ConfeiteiroService confeiteiroService;

    public ConfeiteiroController(ConfeiteiroService confeiteiroService) {
        this.confeiteiroService = confeiteiroService;
    }

    @PostMapping
    public ResponseEntity<Object> saveConfeiteiro(@RequestBody @Valid ConfeiteiroDto confeiteiroDto) {
        var confeiteiroModel = new ConfeiteiroModel();
        BeanUtils.copyProperties(confeiteiroDto, confeiteiroModel);
        confeiteiroModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(confeiteiroService.save(confeiteiroModel));
    }
}
