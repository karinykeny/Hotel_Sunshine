package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Funcionario;

@Repository
public interface FuncionarioRepositorio	extends JpaRepository<Funcionario, Integer>{

}
