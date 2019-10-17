package com.hotelsunshine.hotelsunshine.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelsunshine.hotelsunshine.models.Quarto;

@Repository
public interface QuartoRepositorio extends JpaRepository<Quarto, Integer> {

}
