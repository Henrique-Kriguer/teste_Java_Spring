package com.HenriqueKriguer.backEndTest.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.HenriqueKriguer.backEndTest.entities.Pessoa;
import com.HenriqueKriguer.backEndTest.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private PessoaRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p3 = new Pessoa(null, "João José Soares", "25/12/1965");
		Pessoa p4 = new Pessoa(null, "Ferdinand Dualib", "01/08/1974");
		
		userRepository.saveAll(Arrays.asList(p3,p4));
	}

}
