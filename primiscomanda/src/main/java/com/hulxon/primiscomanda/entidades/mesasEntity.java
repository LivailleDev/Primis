package com.hulxon.primiscomanda.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "mesas", schema = "PrimisWork")
public class MesasEntity {
	@Id
	private Long  numMesa;
	@OneToMany
	@JoinColumn(name= "numMesa")
	private List<ComandasEntity> comandas;
	public Long getNumMesa() {
		return numMesa;
	}
	public void setNumMesa(Long numMesa) {
		this.numMesa = numMesa;
	}
	public List<ComandasEntity> getComandas() {
		return comandas;
	}
	public void setComandas(List<ComandasEntity> comandas) {
		this.comandas = comandas;
	}
	
	
}