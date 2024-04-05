package unah.hn.lenguajes.pauta.carwash1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.pauta.carwash1.entities.TipoCliente;
import unah.hn.lenguajes.pauta.carwash1.services.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("api/tipocliente")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestParam String descripcion) {
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }
    


}