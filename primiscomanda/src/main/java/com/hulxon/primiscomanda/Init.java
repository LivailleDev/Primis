package com.hulxon.primiscomanda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hulxon.primiscomanda.dao.ClientesRepository;
import com.hulxon.primiscomanda.entidades.ClientesEntity;

import jakarta.annotation.PostConstruct;

@Component
public class Init {
	@Autowired
	ClientesRepository clientesRepository;
	@PostConstruct
	public void start() {
		ClientesEntity cliente=clientesRepository.findById(1).get();
		System.out.println("Olá mundo!");
		System.out.println(cliente.getNome());
	}
}
