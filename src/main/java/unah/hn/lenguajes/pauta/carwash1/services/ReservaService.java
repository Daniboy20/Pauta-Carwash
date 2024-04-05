package unah.hn.lenguajes.pauta.carwash1.services;

import unah.hn.lenguajes.pauta.carwash1.entities.Reserva;

public interface ReservaService {
    
    public String crearReserva(Long codigoCliente, Long idVehiculo, Long dias);


}
