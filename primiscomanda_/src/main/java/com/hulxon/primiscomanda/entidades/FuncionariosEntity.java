package com.hulxon.primiscomanda.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class FuncionariosEntity {
	private String nome;
	private Double salario;
	private Integer comissao;
	private String funcao;
	private Date admissao;
	private Date demissao;
	private String cpf;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
