package com.fatec.testeSpring.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.fatec.testeSpring.modelo.Pessoa;

public interface PessoaRepositorio extends CrudRepository<Pessoa, String>{
	Pessoa findById(long id);
}
