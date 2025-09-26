package com.danignz.canciones.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.danignz.canciones.modelos.Cancion;

public interface RepositorioCancion extends CrudRepository<Cancion,Long>{

    List<Cancion>findAll();
} 