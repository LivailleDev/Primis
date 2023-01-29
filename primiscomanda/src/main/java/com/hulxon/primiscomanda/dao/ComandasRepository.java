package com.hulxon.primiscomanda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hulxon.primiscomanda.entidades.ComandasEntity;

public interface ComandasRepository extends JpaRepository<ComandasEntity, Long> {

}
