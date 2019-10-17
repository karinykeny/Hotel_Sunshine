package com.hotelsunshine.hotelsunshine.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelsunshine.hotelsunshine.models.Funcionario;

@Repository
public interface FuncionarioRepositorio	extends JpaRepository<Funcionario, Integer>{

}
