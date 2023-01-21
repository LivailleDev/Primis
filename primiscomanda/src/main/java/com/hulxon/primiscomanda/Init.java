package com.hulxon.primiscomanda;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hulxon.primiscomanda.dao.ClientesRepository;
import com.hulxon.primiscomanda.dao.ProdutosRepository;
import com.hulxon.primiscomanda.entidades.ClientesEntity;
import com.hulxon.primiscomanda.entidades.ProdutosEntity;

@Component
public class Init {

	@Autowired
	ClientesRepository clientesRepository;
	@Autowired
	ProdutosRepository produtosRepository;

	@PostConstruct
	public void start() {
		ClientesEntity cliente = null;
		cliente = clientesRepository.findById((long) 1).get();
		System.out.println("Olá mundo!");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		
		cliente = new ClientesEntity ();
		cliente.setNome("Gabriel");
		cliente.setEmail("gabriel@gmail.com");
		cliente.setEndereco("rua 10");
		cliente.setTelefone("8563147");
		cliente.setSalario(new Double ("5000"));
		cliente.setProfissao("personal");
		clientesRepository.save(cliente);
	    
	    ProdutosEntity produto = new ProdutosEntity{};
	    produto.setDescricao("garrafa");
	    produto.setPrecodecompra(new Double ("1"));
	    produto.setPrecodevenda(new Double ("5"));
	    produto.setQuantidade(new Integer ("50"));
	    produto.setUnidade("un");
	    produtosRepository.save(produto);
	    
	    
	    
	}
}
