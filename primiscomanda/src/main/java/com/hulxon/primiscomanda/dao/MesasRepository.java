package com.hulxon.primiscomanda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.MesasEntity;

@Repository
	public interface MesasRepository extends JpaRepository<MesasEntity, Long> {

}
