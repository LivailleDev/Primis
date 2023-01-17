package com.hulxon.primiscomanda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.hulxon.primiscomanda.entidades.ClientesEntity;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Integer> {

	
}
