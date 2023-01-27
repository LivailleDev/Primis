package com.hulxon.primiscomanda.dao.escola;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.escola.MateriasTable;

@Repository
public interface MateriasRepository extends JpaRepository<MateriasTable, Long> {

	
}
