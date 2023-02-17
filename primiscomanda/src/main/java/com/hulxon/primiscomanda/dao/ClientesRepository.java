package com.hulxon.primiscomanda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.ClientesEntity;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {

	 List <ClientesEntity> findByNomeContaining (String nome);
}
