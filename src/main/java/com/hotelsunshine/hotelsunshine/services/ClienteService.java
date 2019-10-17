package com.hotelsunshine.hotelsunshine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelsunshine.hotelsunshine.models.Cliente;
import com.hotelsunshine.hotelsunshine.repositorios.ClienteRepositorio;
import com.hotelsunshine.hotelsunshine.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepositorio cliRepo;

	public Cliente insertCliente(Cliente obj) {
		obj.setId(null);
		return cliRepo.save(obj);
	}

	public List<Cliente> findClienteAll() {
		return cliRepo.findAll();

	}

	public Cliente findClienteById(Integer id) {
		Optional<Cliente> obj = cliRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"objeto não encontrado! Id: " + id + ",tipo: " + Cliente.class.getName()));
	}

	public Cliente updateCliente(Cliente obj) {
		findClienteById(obj.getId());
		return cliRepo.save(obj);
	}

	public void deleteCliente(Integer id) {
		findClienteById(id);
		cliRepo.deleteById(id);

	}

}
