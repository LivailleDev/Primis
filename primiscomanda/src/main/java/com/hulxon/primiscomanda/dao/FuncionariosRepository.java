package com.hulxon.primiscomanda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hulxon.primiscomanda.entidades.FuncionariosEntity;

public interface FuncionariosRepository extends JpaRepository<FuncionariosEntity, Long> {

	List <FuncionariosEntity> findByNomeContaining (String nome);
}
