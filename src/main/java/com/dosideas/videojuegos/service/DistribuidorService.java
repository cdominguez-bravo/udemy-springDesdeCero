package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Distribuidor;
import com.dosideas.videojuegos.repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorService {
    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<Distribuidor> buscarTodos(){
        return distribuidorRepository.findAll();
    }
}
