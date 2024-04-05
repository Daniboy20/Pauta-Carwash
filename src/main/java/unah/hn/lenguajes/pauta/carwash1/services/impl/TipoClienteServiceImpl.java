package unah.hn.lenguajes.pauta.carwash1.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.pauta.carwash1.entities.TipoCliente;
import unah.hn.lenguajes.pauta.carwash1.repositories.TipoClienteRepository;
import unah.hn.lenguajes.pauta.carwash1.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {

         TipoCliente tipoCliente = new TipoCliente();
         tipoCliente.setDescripcion(descripcion);

        return this.tipoClienteRepository.save(tipoCliente);
    }
}
