package unah.hn.lenguajes.pauta.carwash1.services;

import java.util.List;

import unah.hn.lenguajes.pauta.carwash1.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public Cliente obtenerCliente(Long codigoCliente);

    public List<Cliente> obtenerTodoCliente();

}