package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.DistribuidorService;
import com.dosideas.videojuegos.service.VideoJuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {

    private final DistribuidorService distribuidorService;
    private final VideoJuegoService videoJuegoService;

    public VideojuegoAbmController(DistribuidorService distribuidorService, VideoJuegoService videoJuegoService) {
        this.distribuidorService = distribuidorService;
        this.videoJuegoService = videoJuegoService;
    }


    @RequestMapping("/videojuegos/crear")
    public String mostraFormAlta(Model model){
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formVideojuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuego videjuego){
        videoJuegoService.guardar(videjuego);
        return "redirect:/";
    }


}
