package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Reserva;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, Integer>{

}
