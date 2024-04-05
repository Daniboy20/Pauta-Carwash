package unah.hn.lenguajes.pauta.carwash1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.pauta.carwash1.services.impl.ReservaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/crear")
    public String crearReserva(@RequestParam Long codigoCliente, @RequestParam Long idVehiculo, @RequestParam Long dias) {
        return this.reservaServiceImpl.crearReserva(codigoCliente, idVehiculo, dias);
    }
    

}
