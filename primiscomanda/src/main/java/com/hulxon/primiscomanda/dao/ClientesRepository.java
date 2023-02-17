package com.hulxon.primiscomanda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.ClientesEntity;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {

	@Query ("select c from ClienteEntity c where c.nome like '%?1%'")
	public List <ClientesEntity> pesquisarPorNome (String nome);
	
}
