package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.VideoJuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final VideoJuegoService videoJuegoService;

    public ListadoController(VideoJuegoService videoJuegoService) {
        this.videoJuegoService = videoJuegoService;
    }

    @RequestMapping("/")
    public String listarVideoJuegos(Model model){
        //busqueda de video de juegos
        List<Videojuego> destacados = videoJuegoService.buscarDestacados();
        model.addAttribute("videojuegos",destacados);
        return "listado";
    }
}
