package unah.hn.lenguajes.pauta.carwash1.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reserva")
@Data
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private long idReserva;

    @ManyToOne
    @JoinColumn(name = "idcliente", referencedColumnName = "codigocliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idvehiculo", referencedColumnName = "idvehiculo")
    private Vehiculo vehiculo;

    LocalDate fecha;

    private long dias;

    private double total;


}
