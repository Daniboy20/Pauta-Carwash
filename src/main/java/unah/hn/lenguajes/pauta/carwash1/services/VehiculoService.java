package unah.hn.lenguajes.pauta.carwash1.services;

import java.util.List;

import unah.hn.lenguajes.pauta.carwash1.entities.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public Vehiculo obtenerVehiculo(Long idVehiculo);

    public List<Vehiculo> obtenerTodoVehiculo();
}
