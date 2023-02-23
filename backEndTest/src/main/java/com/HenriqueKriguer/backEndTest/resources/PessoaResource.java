package com.HenriqueKriguer.backEndTest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HenriqueKriguer.backEndTest.entities.Pessoa;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

	@GetMapping
	public ResponseEntity<Pessoa> findAll(){
		Pessoa p = new Pessoa(1L,"Maria","23/10/1971");
		return ResponseEntity.ok().body(p);
	}
}
