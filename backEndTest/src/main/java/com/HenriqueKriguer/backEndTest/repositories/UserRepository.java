package com.HenriqueKriguer.backEndTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HenriqueKriguer.backEndTest.entities.Pessoa;

public interface UserRepository extends JpaRepository<Pessoa, Long>{

}
