package unah.hn.lenguajes.pauta.carwash1.services.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.pauta.carwash1.entities.Cliente;
import unah.hn.lenguajes.pauta.carwash1.entities.Reserva;
import unah.hn.lenguajes.pauta.carwash1.entities.Vehiculo;
import unah.hn.lenguajes.pauta.carwash1.repositories.ClienteRepository;
import unah.hn.lenguajes.pauta.carwash1.repositories.ReservaRepository;
import unah.hn.lenguajes.pauta.carwash1.repositories.VehiculoRepository;
import unah.hn.lenguajes.pauta.carwash1.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

   @Autowired
   private ClienteRepository clienteRepository;

   @Autowired
   private VehiculoRepository vehiculoRepository;

   @Autowired
   private ReservaRepository reservaRepository;

    @Override
    public String crearReserva(Long codigoCliente, Long idVehiculo, Long dias) {
        
        
        if((this.clienteRepository.existsById(codigoCliente)) && (this.vehiculoRepository.existsById(idVehiculo)))
        {
            
            Cliente cliente = this.clienteRepository.findById(codigoCliente).get();
            Vehiculo vehiculo = this.vehiculoRepository.findById(idVehiculo).get();
            
            
             if(vehiculo.isDisponible() == false)
            {
                return "El Vehiculo Se Encuentra Rentado";
            }
            
            {
                LocalDate fechaReserva = LocalDate.now();
                Reserva reserva = new Reserva(); 
                reserva.setCliente(cliente);
                reserva.setVehiculo(vehiculo);
                reserva.setFecha(fechaReserva);
                reserva.setTotal(vehiculo.getTipoVehiculo().getPrecioXHora() * dias);
                reserva.setDias(dias);
                this.reservaRepository.save(reserva);
                vehiculo.setDisponible(false);
                this.vehiculoRepository.save(vehiculo);
                 return "Vehiculo Rentado Con Exito";
                }
            }
            return null;  
        }
    
}
