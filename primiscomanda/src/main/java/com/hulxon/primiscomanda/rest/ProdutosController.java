package com.hulxon.primiscomanda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulxon.primiscomanda.dao.ProdutosRepository;
import com.hulxon.primiscomanda.entidades.ProdutosEntity;

	@RestController
	@RequestMapping("/adcionar")
	public class ProdutosController {
		
		@Autowired
		ProdutosRepository produtosRepository;
		
		
		@GetMapping(path="/listartodos")
		public List<ProdutosEntity> listarProdutos (){
			List<ProdutosEntity> produtos= produtosRepository.findAll();
			return produtos;		
		}
		@PostMapping(path="/gravar")
		public void gravar (@RequestBody ProdutosEntity produtos) {
			produtosRepository.save(produtos);
		}
		@GetMapping(path = "/apagar/{id}")
		public void apagar(@PathVariable(value ="id") Long id) {
			ProdutosEntity produtos = produtosRepository.findById(id).get();
			produtosRepository.delete(produtos);
		}
		
}
