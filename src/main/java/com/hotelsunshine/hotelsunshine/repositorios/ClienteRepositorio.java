package com.hotelsunshine.hotelsunshine.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelsunshine.hotelsunshine.models.Cliente;


@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
	

}
