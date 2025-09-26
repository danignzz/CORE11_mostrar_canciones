package com.danignz.canciones.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.danignz.canciones.modelos.Cancion;
import com.danignz.canciones.servicios.ServicioCancion;

@Controller
public class ControladorCancion {
    @Autowired
    private final ServicioCancion servicioCancion;

    public ControladorCancion(ServicioCancion servicioCancion){
        this.servicioCancion=servicioCancion;
    }

    @GetMapping("/canciones")
    public String desplegarCanciones(Model modelo){
       List<Cancion>listaCanciones = this.servicioCancion.obtenerTodasLasCanciones(); 
       modelo.addAttribute("listaCanciones", listaCanciones);
            return "canciones";
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model modelo) {
        Cancion cancion = this.servicioCancion.obtenerCancionPorId(idCancion);
        modelo.addAttribute("cancion", cancion);
            return "detalleCancion";
    }
}
