package com.hulxon.primiscomanda.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="itensComanda", schema = "PrimisWork")
public class ItensComandaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer quantidade;
	private Double desconto;
	private Double valor;
	@ManyToOne
	@JoinColumn (name= "idComanda")
	private ComandasEntity comanda;
	@ManyToOne
	@JoinColumn (name= "idproduto")
	private ProdutosEntity produto;

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public ComandasEntity getComanda() {
		return comanda;
	}

	public void setComanda(ComandasEntity comanda) {
		this.comanda = comanda;
	}

	public ProdutosEntity getProduto() {
		return produto;
	}

	public void setProduto(ProdutosEntity produto) {
		this.produto = produto;
	}

}
