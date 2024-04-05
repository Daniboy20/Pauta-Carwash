package unah.hn.lenguajes.pauta.carwash1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.pauta.carwash1.entities.TipoVehiculo;
import unah.hn.lenguajes.pauta.carwash1.entities.Vehiculo;
import unah.hn.lenguajes.pauta.carwash1.repositories.TipoVehiculoRepository;
import unah.hn.lenguajes.pauta.carwash1.repositories.VehiculoRepository;
import unah.hn.lenguajes.pauta.carwash1.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {

        long id = vehiculo.getTipoVehiculo().getIdTipoVehiculo();

        if(this.tipoVehiculoRepository.existsById(id))
        {
            TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository.findById(id).get();
            vehiculo.setTipoVehiculo(tipoVehiculo);
            return this.vehiculoRepository.save(vehiculo);

        }

        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public Vehiculo obtenerVehiculo(Long idVehiculo) {
        
        return this.vehiculoRepository.findById(idVehiculo).get();
    }

    @Override
    public List<Vehiculo> obtenerTodoVehiculo() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }
    
}