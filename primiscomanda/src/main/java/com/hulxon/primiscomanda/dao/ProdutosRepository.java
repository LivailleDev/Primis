package com.hulxon.primiscomanda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.ProdutosEntity;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosEntity, Long> {
	List <ProdutosEntity> findByDescricaoContaining (String descricao);
}
