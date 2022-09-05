package com.api.docerialindoces.services;

import com.api.docerialindoces.models.ClienteModel;
import com.api.docerialindoces.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ClienteService {

    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public ClienteModel save(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }
}
