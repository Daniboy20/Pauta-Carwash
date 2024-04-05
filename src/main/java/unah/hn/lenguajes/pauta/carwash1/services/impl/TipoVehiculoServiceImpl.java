package unah.hn.lenguajes.pauta.carwash1.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.pauta.carwash1.entities.TipoVehiculo;
import unah.hn.lenguajes.pauta.carwash1.entities.Vehiculo;
import unah.hn.lenguajes.pauta.carwash1.repositories.TipoVehiculoRepository;
import unah.hn.lenguajes.pauta.carwash1.repositories.VehiculoRepository;
import unah.hn.lenguajes.pauta.carwash1.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {
    
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarTipoVehiculo(Long idTipoVehiculo) {

        if(this.tipoVehiculoRepository.existsById(idTipoVehiculo))
        {
            List<Vehiculo> listaVehiculo = (List<Vehiculo>) this.vehiculoRepository.findAll();

            for (Vehiculo vehiculo : listaVehiculo) {
                
               if (vehiculo.getTipoVehiculo().getIdTipoVehiculo() == idTipoVehiculo)
               {
                    this.vehiculoRepository.delete(vehiculo);  
               }

            } 

            this.tipoVehiculoRepository.deleteById(idTipoVehiculo);
            return "Tipo de Vehiculo Eliminado";      

        }
        return "Tipo de Vehiculo No Existe";

           
           
      
        
    }

 

    
}