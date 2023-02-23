package com.HenriqueKriguer.backEndTest.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.HenriqueKriguer.backEndTest.entities.Pessoa;
import com.HenriqueKriguer.backEndTest.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Henrique Kriguer", "23/10/1971");
		Pessoa p2 = new Pessoa(null, "Simone Kriguer", "11/11/1971");
		
		userRepository.saveAll(Arrays.asList(p1,p2));
	}

}
