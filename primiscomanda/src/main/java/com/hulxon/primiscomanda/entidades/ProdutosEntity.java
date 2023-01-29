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
	private Double precoDeCompra;
	private Double precoDeVenda;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProdutos;
		
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
	public Double getPrecoDeCompra() {
		return precoDeCompra;
	}
	public void setPrecoDeCompra(Double precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}
	public Double getPrecoDeVenda() {
		return precoDeVenda;
	}
	public void setPrecoDeVenda(Double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	public Long getIdProdutos() {
		return idProdutos;
	}
	public void setIdProdutos(Long idProdutos) {
		this.idProdutos = idProdutos;
	}

}
