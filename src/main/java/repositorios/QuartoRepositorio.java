package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Quarto;

@Repository
public interface QuartoRepositorio extends JpaRepository<Quarto, Integer> {

}
