package com.HenriqueKriguer.backEndTest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HenriqueKriguer.backEndTest.entities.Pessoa;
import com.HenriqueKriguer.backEndTest.repositories.PessoaRepository;
import com.HenriqueKriguer.backEndTest.services.exceptions.ResourceNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll(){
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		Optional <Pessoa> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Pessoa insert(Pessoa obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Pessoa update(Long id, Pessoa obj) {
		Pessoa entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	
	private void updateData(Pessoa entity, Pessoa obj) {
		entity.setName(obj.getName());
		entity.setBirthDate(obj.getBirthDate());
	}
	
	
}
