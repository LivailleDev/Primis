package com.hulxon.primiscomanda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulxon.primiscomanda.dao.FuncionariosRepository;
import com.hulxon.primiscomanda.entidades.FuncionariosEntity;
	
	@RestController
<<<<<<< Updated upstream
	@RequestMapping("/funcionario")
=======
	@RequestMapping("/funcionarios")
>>>>>>> Stashed changes
	public class FuncionariosController {
		
		@Autowired
		FuncionariosRepository funcionariosRepository;
		
		
		@GetMapping(path="/listartodos")
		public List<FuncionariosEntity> listarFuncionarios (){
			List<FuncionariosEntity> funcionarios= funcionariosRepository.findAll();
			return funcionarios;	
		}
		@PostMapping(path="/gravar")
		public void gravar (@RequestBody FuncionariosEntity funcionario) {
			funcionariosRepository.save(funcionario);
		}
		@GetMapping(path = "/apagar/{id}")
		public void apagar(@PathVariable(value ="id") Long id) {
			FuncionariosEntity funcionario = funcionariosRepository.findById(id).get();
			funcionariosRepository.delete(funcionario);
		}

	}
