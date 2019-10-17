package com.hotelsunshine.hotelsunshine.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelsunshine.hotelsunshine.models.Reserva;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, Integer>{

}
