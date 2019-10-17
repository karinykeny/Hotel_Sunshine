package com.hotelsunshine.hotelsunshine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelsunshine.hotelsunshine.models.Funcionario;
import com.hotelsunshine.hotelsunshine.repositorios.FuncionarioRepositorio;
import com.hotelsunshine.hotelsunshine.services.exceptions.ObjectNotFoundException;


@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepositorio funcRepo;

	public Funcionario insertFuncionario(Funcionario obj) {
		obj.setId(null);
		return funcRepo.save(obj);
	}

	public List<Funcionario> findFuncionarioAll() {
		return funcRepo.findAll();

	}

	public Funcionario findFuncionarioById(Integer id) {
		Optional<Funcionario> obj = funcRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"objeto não encontrado! Id: " + id + ",tipo: " + Funcionario.class.getName()));
	}

	public Funcionario updateFuncionario(Funcionario obj) {
		findFuncionarioById(obj.getId());
		return funcRepo.save(obj);
	}

}
