package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoJuegoRepository extends JpaRepository<Videojuego, Integer> {

    @Query("from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();

    @Query("from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);

    List<Videojuego> findByNombreContaining(String consulta);
}
