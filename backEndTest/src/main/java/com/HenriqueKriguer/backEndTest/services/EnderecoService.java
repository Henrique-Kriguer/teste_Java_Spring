package com.HenriqueKriguer.backEndTest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HenriqueKriguer.backEndTest.entities.Endereco;
import com.HenriqueKriguer.backEndTest.repositories.EnderecoRepository;
import com.HenriqueKriguer.backEndTest.services.exceptions.ResourceNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	public List<Endereco> findAll(){
		return repository.findAll();
	}
	
	public Endereco findById(Long id) {
		Optional <Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
}
