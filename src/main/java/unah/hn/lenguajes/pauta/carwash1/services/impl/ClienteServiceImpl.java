package unah.hn.lenguajes.pauta.carwash1.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.pauta.carwash1.entities.Cliente;
import unah.hn.lenguajes.pauta.carwash1.entities.TipoCliente;
import unah.hn.lenguajes.pauta.carwash1.repositories.ClienteRepository;
import unah.hn.lenguajes.pauta.carwash1.repositories.TipoClienteRepository;
import unah.hn.lenguajes.pauta.carwash1.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {

        long id = cliente.getTipoCliente().getIdTipoCliente();

        LocalDate fechaIngreso = LocalDate.now();
        cliente.setFechaIngreso(fechaIngreso);

        if(this.tipoClienteRepository.existsById(id))
        {
            TipoCliente tipoCliente = this.tipoClienteRepository.findById(id).get();
            cliente.setTipoCliente(tipoCliente);
            return this.clienteRepository.save(cliente);

        }

        return this.clienteRepository.save(cliente);

    }

    @Override
    public Cliente obtenerCliente(Long codigoCliente) {
        return this.clienteRepository.findById(codigoCliente).get();
    }

    @Override
    public List<Cliente> obtenerTodoCliente() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }
    



}