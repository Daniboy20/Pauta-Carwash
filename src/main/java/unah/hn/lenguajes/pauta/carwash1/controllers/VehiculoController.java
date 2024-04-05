package unah.hn.lenguajes.pauta.carwash1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.pauta.carwash1.entities.Vehiculo;
import unah.hn.lenguajes.pauta.carwash1.services.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("api/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/obtener")
    public Vehiculo obtenerVehiculo(@RequestParam Long idVehiculo) {
        return this.vehiculoServiceImpl.obtenerVehiculo(idVehiculo);
    }
    
    @GetMapping("/todos")
    public List<Vehiculo> todosVehiculo() {
        return this.vehiculoServiceImpl.obtenerTodoVehiculo();
    }


}
