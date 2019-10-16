package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Cliente;


@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
	

}
