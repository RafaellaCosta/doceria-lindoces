package com.api.docerialindoces.services;

import com.api.docerialindoces.models.ConfeiteiroModel;
import com.api.docerialindoces.repositories.ConfeiteiroRepository;
import org.springframework.stereotype.Service;

@Service
public class ConfeiteiroService {

    final ConfeiteiroRepository confeiteiroRepository;

    public ConfeiteiroService(ConfeiteiroRepository confeiteiroRepository) {
        this.confeiteiroRepository = confeiteiroRepository;
    }

    public ConfeiteiroModel save(ConfeiteiroModel confeiteiroModel) {
        return confeiteiroRepository.save(confeiteiroModel);
    }
}
