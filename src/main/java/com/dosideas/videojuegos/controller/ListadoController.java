package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.VideoJuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> juegos = videoJuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model){
        List<Videojuego> juegos = videoJuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
}
