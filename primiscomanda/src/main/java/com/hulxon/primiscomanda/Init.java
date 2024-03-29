package com.hulxon.primiscomanda;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hulxon.primiscomanda.dao.ClientesRepository;
import com.hulxon.primiscomanda.dao.FuncionariosRepository;
import com.hulxon.primiscomanda.dao.MesasRepository;
import com.hulxon.primiscomanda.dao.ProdutosRepository;
import com.hulxon.primiscomanda.entidades.ClientesEntity;
import com.hulxon.primiscomanda.entidades.MesasEntity;

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
	
	public void teste(){
		System.out.println("Teste de branch");
	}
	
//	@PostConstruct
	public void start() throws ParseException {
		ClientesEntity cliente = null;
		cliente = clientesRepository.findById((long) 1).get();
		System.out.println("Olá mundo!");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());

		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * cliente = new ClientesEntity (); cliente.setNome("Gabriel");
		 * cliente.setEmail("gabriel@gmail.com"); cliente.setEndereco("rua 10");
		 * cliente.setTelefone("8563147"); cliente.setSalario(new Double ("5000"));
		 * cliente.setProfissao("personal"); clientesRepository.save(cliente);
		 */

		/*
		 * ProdutosEntity produto = new ProdutosEntity(); for (int i = 1; i <= 12; i++)
		 * {
		 * 
		 * produto = produtosRepository.findById(new Long(i)).get();
		 * produtosRepository.delete(produto); }
		 */

		/*
		 * ProdutosEntity produto = new ProdutosEntity();
		 * produto.setDescricao("garrafa"); produto.setPrecodecompra(new Double("1"));
		 * produto.setPrecodevenda(new Double("5")); produto.setQuantidade(new
		 * Integer("50")); produto.setUnidade("un"); produtosRepository.save(produto);
		 * 
		 * produto = new ProdutosEntity(); produto.setDescricao("vodka");
		 * produto.setPrecodecompra(new Double("55")); produto.setPrecodevenda(new
		 * Double("150")); produto.setQuantidade(new Integer("100"));
		 * produto.setUnidade("un"); produtosRepository.save(produto);
		 */

		/*ProdutosEntity produto = produtosRepository.findById(new Long(13)).get();
		produto.setDescricao("gin");
		produto.setPrecodecompra(new Double("64"));
		produto.setPrecodevenda(new Double("240"));
		produto.setQuantidade(new Integer("40"));
		produto.setUnidade("un");
		produtosRepository.save(produto);*/

		/*MesasEntity mesas = new MesasEntity();
		mesas = new MesasEntity();
		mesas.setNumMesa(new Long(1));
		mesasRepository.save(mesas);
		
		mesas = new MesasEntity();
		mesas.setNumMesa(new Long(2));
		mesasRepository.save(mesas);
		
		mesas = new MesasEntity();
		mesas.setNumMesa(new Long(3));
		mesasRepository.save(mesas);
		
		mesas = new MesasEntity();
		mesas.setNumMesa(new Long(4));
		mesasRepository.save(mesas);*/
		
		/*mesas.setNumMesa(new Long(5));
		mesasRepository.save(mesas);*/
		
		MesasEntity mesas = new MesasEntity();
		for (int i = 6; i <= 10; i++) {
			
		mesas = new MesasEntity();
		mesas.setNumMesa(new Long(i));
		mesasRepository.save(mesas);	
		}

		
		/*
		 * FuncionariosEntity funcionario = new FuncionariosEntity();
		 * funcionario.setAdmissao(dataFormatada.parse("05/01/2001"));
		 * funcionario.setComissao(13); funcionario.setCpf("961.654.7451.75");
		 * funcionario.setFuncao("barman"); funcionario.setNome("Rodrigo Borges");
		 * funcionario.setSalario(new Double ("2500"));
		 * funcionariosRepository.save(funcionario);
		 * 
		 * funcionario = new FuncionariosEntity();
		 * funcionario.setAdmissao(dataFormatada.parse("01/01/2001"));
		 * funcionario.setComissao(13); funcionario.setCpf("578.694.314.45");
		 * funcionario.setFuncao("barman"); funcionario.setNome("Alessandra Dias");
		 * funcionario.setSalario(new Double ("2500"));
		 * funcionariosRepository.save(funcionario);
		 * 
		 * funcionario = new FuncionariosEntity();
		 * funcionario.setAdmissao(dataFormatada.parse("02/01/2001"));
		 * funcionario.setComissao(11); funcionario.setCpf("845.124.751.42");
		 * funcionario.setFuncao("garcon"); funcionario.setNome("Joao Soares");
		 * funcionario.setSalario(new Double ("2500"));
		 * funcionariosRepository.save(funcionario);
		 * 
		 * funcionario = new FuncionariosEntity();
		 * funcionario.setAdmissao(dataFormatada.parse("04/01/2001"));
		 * funcionario.setComissao(11); funcionario.setCpf("075.485.213.41");
		 * funcionario.setFuncao("garconete"); funcionario.setNome("Sabrina Tedesco");
		 * funcionario.setSalario(new Double ("2500"));
		 * funcionariosRepository.save(funcionario);
		 */

		/*
		 * FuncionariosEntity funcionario = funcionariosRepository.findById(new
		 * Long(1)).get(); funcionariosRepository.delete(funcionario);
		 */

		/*
		 * FuncionariosEntity funcionario = funcionariosRepository.findById(new
		 * Long(2)).get(); funcionariosRepository.delete(funcionario);
		 */
	}
}
