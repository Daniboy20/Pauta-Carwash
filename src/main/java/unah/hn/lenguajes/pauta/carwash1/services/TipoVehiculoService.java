package unah.hn.lenguajes.pauta.carwash1.services;

import unah.hn.lenguajes.pauta.carwash1.entities.TipoVehiculo;

public interface TipoVehiculoService {
    
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);


    public String eliminarTipoVehiculo(Long idTipoVehiculo);
    
}
