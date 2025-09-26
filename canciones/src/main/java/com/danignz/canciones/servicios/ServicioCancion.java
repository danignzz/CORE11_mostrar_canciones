package com.danignz.canciones.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danignz.canciones.modelos.Cancion;
import com.danignz.canciones.repositorios.RepositorioCancion;

@Service
public class ServicioCancion {
    
    @Autowired
    private final RepositorioCancion repositorioCancion;

    public ServicioCancion(RepositorioCancion repositorioCancion){
        this.repositorioCancion = repositorioCancion;     
    }

    public List<Cancion> obtenerTodasLasCanciones() {
    List<Cancion> lista = new ArrayList<>();
    repositorioCancion.findAll().forEach(lista::add);
    return lista;
    }

    public Cancion obtenerCancionPorId(Long id){
        return this.repositorioCancion.findById(id).orElse(null);
    }
}
