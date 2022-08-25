package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Distribuidor;
import com.dosideas.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {



}
