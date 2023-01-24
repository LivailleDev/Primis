package com.hulxon.primiscomanda;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hulxon.primiscomanda.dao.ClientesRepository;
import com.hulxon.primiscomanda.dao.FuncionariosRepository;
import com.hulxon.primiscomanda.dao.MesasRepository;
import com.hulxon.primiscomanda.dao.ProdutosRepository;
import com.hulxon.primiscomanda.entidades.ClientesEntity;
import com.hulxon.primiscomanda.entidades.FuncionariosEntity;
import com.hulxon.primiscomanda.entidades.MesasEntity;
import com.hulxon.primiscomanda.entidades.ProdutosEntity;

@Component
public class Init {

	@Autowired
	ClientesRepository clientesRepository;
	@Autowired
	ProdutosRepository produtosRepository;
	@Autowired
	MesasRepository mesasRepository;
	@Autowired
	FuncionariosRepository funcionariosRepository;
	

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
	    
	    ProdutosEntity produto = new ProdutosEntity (){};
	    produto.setDescricao("garrafa");
	    produto.setPrecodecompra(new Double ("1"));
	    produto.setPrecodevenda(new Double ("5"));
	    produto.setQuantidade(new Integer ("50"));
	    produto.setUnidade("un");
	    
	    produto.setDescricao("vodka");
	    produto.setPrecodecompra(new Double ("55"));
	    produto.setPrecodevenda(new Double ("150"));
	    produto.setQuantidade(new Integer ("100"));
	    produto.setUnidade("un");
	    
	    produto.setDescricao("gin");
	    produto.setPrecodecompra(new Double ("64"));
	    produto.setPrecodevenda(new Double ("240"));
	    produto.setQuantidade(new Integer ("40"));
	    produto.setUnidade("un");
	    
	    produtosRepository.save(produto);
	    
	    
	    MesasEntity mesas = new MesasEntity(){};
	    mesas.setNumMesa(new Long (1));
	    mesas.setNumMesa(new Long (2));
	    mesas.setNumMesa(new Long (3));
	    mesas.setNumMesa(new Long (4));
	    mesas.setNumMesa(new Long (5));
	    mesasRepository.save(mesas);
	    
	  FuncionariosEntity funcionario = new FuncionariosEntity(){};
	  funcionario.setAdmissao(new Date("11-01-2001"));
	  funcionario.setComissao(13);
	  funcionario.setCpf("961.654.7451.75");
	  funcionario.setDemissao(new Date(""));
	  funcionario.setFuncao("barman");
	  funcionario.setNome("Rodrigo Borges");
	  funcionario.setSalario(new Double ("2500"));
	  
	  funcionario.setAdmissao(new Date ("01-09-2001"));
	  funcionario.setComissao(13);
	  funcionario.setCpf("578.694.314.45");
	  funcionario.setDemissao(new Date(""));
	  funcionario.setFuncao("barman");
	  funcionario.setNome("Alessandra Dias");
	  funcionario.setSalario(new Double ("2500"));
	  
	  funcionario.setAdmissao(new Date ("05-09-2001"));
	  funcionario.setComissao(11);
	  funcionario.setCpf("845.124.751.42");
	  funcionario.setDemissao(new Date(""));
	  funcionario.setFuncao("garcon");
	  funcionario.setNome("Joao Soares");
	  funcionario.setSalario(new Double ("2500"));
	  
	  funcionario.setAdmissao(new Date ("04-09-2001"));
	  funcionario.setComissao(11);
	  funcionario.setCpf("075.485.213.41");
	  funcionario.setDemissao(new Date(""));
	  funcionario.setFuncao("garconete");
	  funcionario.setNome("Sabrina Tedesco");
	  funcionario.setSalario(new Double ("2500"));
	  
	  funcionariosRepository.save(funcionario);
	    
	   
	}
}
