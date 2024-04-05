package unah.hn.lenguajes.pauta.carwash1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.pauta.carwash1.entities.Cliente;
import unah.hn.lenguajes.pauta.carwash1.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
       return this.clienteServiceImpl.crearCliente(cliente);
    }
    
    @GetMapping("/obtener")
    public Cliente obtenerCliente(@RequestParam Long codigoCliente) {
        return this.clienteServiceImpl.obtenerCliente(codigoCliente);
    }

    @GetMapping("/todos")
    public List<Cliente> todosCliente() {
        return this.clienteServiceImpl.obtenerTodoCliente();
    }
    
    



}
