package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.repository.VideoJuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoJuegoService {

    private final VideoJuegoRepository videoJuegoRepository;

    public VideoJuegoService(VideoJuegoRepository videoJuegoRepository) {
        this.videoJuegoRepository = videoJuegoRepository;
    }

    public List<Videojuego> buscarDestacados(){
        return videoJuegoRepository.findAll();
    }


}
