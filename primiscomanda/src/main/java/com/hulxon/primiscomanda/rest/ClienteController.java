package com.hulxon.primiscomanda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulxon.primiscomanda.dao.ClientesRepository;
import com.hulxon.primiscomanda.entidades.ClientesEntity;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClientesRepository clientesRepository;
	
	
	@GetMapping(path="/listartodos")
	public List<ClientesEntity> listarClientes (){
		List<ClientesEntity> clientes= clientesRepository.findAll();
		return clientes;		
	}
	@PostMapping(path="/gravar")
	public void gravar (@RequestBody ClientesEntity cliente) {
		clientesRepository.save(cliente);
	}
	@GetMapping(path = "/apagar/{id}")
	public void apagar(@PathVariable(value ="id") Long id) {
		ClientesEntity cliente = clientesRepository.findById(id).get();
		clientesRepository.delete(cliente);
	}

}
