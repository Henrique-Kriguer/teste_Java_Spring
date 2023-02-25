package com.HenriqueKriguer.backEndTest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.HenriqueKriguer.backEndTest.entities.Pessoa;
import com.HenriqueKriguer.backEndTest.repositories.PessoaRepository;
import com.HenriqueKriguer.backEndTest.services.exceptions.DatabaseException;
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
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch (DataIntegrityViolationException e) {	
			throw new DatabaseException(e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	public Pessoa update(Long id, Pessoa obj) {
		try {
			Pessoa entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		}catch( RuntimeException e) {
			e.printStackTrace();
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	private void updateData(Pessoa entity, Pessoa obj) {
		entity.setName(obj.getName());
		entity.setBirthDate(obj.getBirthDate());
	}
	
	
}
