package unah.hn.lenguajes.pauta.carwash1.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.hn.lenguajes.pauta.carwash1.entities.Reserva;

public interface ReservaRepository extends CrudRepository <Reserva, Long>  {
    
}
