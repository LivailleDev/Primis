package com.hulxon.primiscomanda.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios", schema = "PrimisWork")
public class FuncionariosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idfuncionario;
	private String nome;
	private Double salario;
	private Integer comissao;
	private String funcao;
	private Date admissao;
	private Date demissao;
	private String cpf;
	@OneToMany
	@JoinColumn (name= "idfuncionario")
	private List<ComandasEntity> comandas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Integer getComissao() {
		return comissao;
	}
	public void setComissao(Integer comissao) {
		this.comissao = comissao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public Date getDemissao() {
		return demissao;
	}
	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Long getIdfuncionario() {
		return idfuncionario;
	}
	public void setIdfuncionario(Long idfuncionario) {
		this.idfuncionario = idfuncionario;
	}
	public List<ComandasEntity> getComandas() {
		return comandas;
	}
	public void setComandas(List<ComandasEntity> comandas) {
		this.comandas = comandas;
	}
	
	
}
