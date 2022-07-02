package com.erickdevs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erickdevs.cursomc.domain.Cliente;
import com.erickdevs.cursomc.repositories.ClienteRepository;
import com.erickdevs.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + ", Tipo: " + Cliente.class.getName()));
	}
}
