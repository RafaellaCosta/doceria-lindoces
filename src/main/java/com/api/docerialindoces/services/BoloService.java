package com.api.docerialindoces.services;

import com.api.docerialindoces.models.BoloModel;
import com.api.docerialindoces.repositories.BoloRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoloService {

    final BoloRepository boloRepository;

    public BoloService(BoloRepository boloRepository) {
        this.boloRepository = boloRepository;
    }

    @Transactional
    public BoloModel save(BoloModel boloModel) {
        return boloRepository.save(boloModel);
    }
}
