package com.HenriqueKriguer.backEndTest.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.HenriqueKriguer.backEndTest.entities.Endereco;
import com.HenriqueKriguer.backEndTest.entities.Pessoa;
import com.HenriqueKriguer.backEndTest.repositories.EnderecoRepository;
import com.HenriqueKriguer.backEndTest.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p3 = new Pessoa(null, "João José Soares", "25/12/1965");
		Pessoa p4 = new Pessoa(null, "Ferdinand Dualib", "01/08/1974");
		
		Endereco e1 = new Endereco(null,"Rua Rui Barbosa","02025-021","103","São Paulo", "SP", p3);
		Endereco e2 = new Endereco(null,"Av. Braz Leme","02222-022","1058","Santos", "SP", p3);
		Endereco e3 = new Endereco(null,"Rua das Orquideas","05555-055","12345","Belo Horizonte", "MG", p3);

		Endereco e4 = new Endereco(null,"Rua a","12500-021","13","Varginha", "MG", p4);
		Endereco e5 = new Endereco(null,"Rua Monte Castelo","24222-044","1450","Florianopolis", "SC", p4);
		
		pessoaRepository.saveAll(Arrays.asList(p3,p4));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5));
	}
}
