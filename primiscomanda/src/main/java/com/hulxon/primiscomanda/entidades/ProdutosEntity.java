package com.hulxon.primiscomanda.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "PrimisWork")
public class ProdutosEntity {
	private String descricao;
	private String unidade;
	private Integer quantidade;
	private Double precodecompra;
	private Double precodevenda;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrecodecompra() {
		return precodecompra;
	}
	public void setPrecodecompra(Double precodecompra) {
		this.precodecompra = precodecompra;
	}
	public Double getPrecodevenda() {
		return precodevenda;
	}
	public void setPrecodevenda(Double precodevenda) {
		this.precodevenda = precodevenda;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
