package com.hulxon.primiscomanda.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class ProdutosEntity {
	private String descricao;
	private String unidade;
	private Integer quantidade;
	private Double precodecompra;
	private Double precodevenda;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
}
