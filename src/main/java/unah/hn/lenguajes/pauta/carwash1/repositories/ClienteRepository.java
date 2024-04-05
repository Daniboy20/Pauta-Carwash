package unah.hn.lenguajes.pauta.carwash1.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.hn.lenguajes.pauta.carwash1.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {
    
}
