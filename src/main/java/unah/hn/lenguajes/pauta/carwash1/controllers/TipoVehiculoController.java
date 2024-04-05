package unah.hn.lenguajes.pauta.carwash1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.pauta.carwash1.entities.TipoVehiculo;
import unah.hn.lenguajes.pauta.carwash1.services.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }
    

    @DeleteMapping("/eliminar")
    public String eliminarTipoVehiculo(@RequestParam Long idTipoVehiculo)
    {
        return this.tipoVehiculoServiceImpl.eliminarTipoVehiculo(idTipoVehiculo);
    }

}