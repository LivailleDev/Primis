package com.hulxon.primiscomanda.dao.escola;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.escola.NotasTable;

@Repository
public interface NotasRepository extends JpaRepository<NotasTable, Long> {

	
}
