package com.hulxon.primiscomanda.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "mesas", schema = "PrimisWork")
public class MesasEntity {
	@Id
	private Long  numMesa;

	public Long getNumMesa() {
		return numMesa;
	}

	public void setNumMesa(Long numMesa) {
		this.numMesa = numMesa;
	}
}