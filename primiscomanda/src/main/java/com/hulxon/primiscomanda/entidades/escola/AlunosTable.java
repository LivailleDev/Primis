package com.hulxon.primiscomanda.entidades.escola;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="alunos",schema="escola")
public class AlunosTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula;
	private String nome;
	private Date dataNascimento;
	@ManyToOne
	@JoinColumn(name="idTurma",nullable = false)
	private TurmasTable turma;
	@OneToOne(mappedBy = "aluno")
	private BoletinsTable boletim;
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public TurmasTable getTurma() {
		return turma;
	}
	public void setTurma(TurmasTable turma) {
		this.turma = turma;
	}
	public BoletinsTable getBoletim() {
		return boletim;
	}
	public void setBoletim(BoletinsTable boletim) {
		this.boletim = boletim;
	}
	
	

}
