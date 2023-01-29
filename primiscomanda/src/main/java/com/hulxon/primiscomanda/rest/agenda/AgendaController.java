package com.hulxon.primiscomanda.rest.agenda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulxon.primiscomanda.dao.agenda.PessoasDao;
import com.hulxon.primiscomanda.entidades.agenda.Pessoas;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
	
	@Autowired
	PessoasDao pessoaDao;
	

	@GetMapping(path = "/listartodos")
	public List<Pessoas> listarPessoas() {
		List<Pessoas> pessoas = pessoaDao.findAll();
		return pessoas;
	}
	
	@PostMapping(path = "/gravar")
	public void gravar(@RequestBody Pessoas pessoa) {
		pessoaDao.save(pessoa);
	}
	@GetMapping(path = "/apagar/{id}")
	public void apagar(@PathVariable(value ="id") Long id) {
		Pessoas pessoa = pessoaDao.findById(id).get();
		pessoaDao.delete(pessoa);
	}

}
