package com.hulxon.primiscomanda.dao.agenda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulxon.primiscomanda.entidades.agenda.Pessoas;

@Repository
public interface PessoasDao extends JpaRepository<Pessoas, Long> {

}
