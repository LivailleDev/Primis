package com.hulxon.primiscomanda.entidades.escola;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "boletins",schema = "escola")
public class BoletinsTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	@JoinColumn(name="matricula")
	private AlunosTable aluno;
	private Long idTurma;
	private Date dataDeConclusao;
	@OneToMany
	@JoinColumn(name="idBoletim")
	private List<NotasTable> notas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AlunosTable getAluno() {
		return aluno;
	}
	public void setAluno(AlunosTable aluno) {
		this.aluno = aluno;
	}
	public Long getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(Long idTurma) {
		this.idTurma = idTurma;
	}
	public Date getDataDeConclusao() {
		return dataDeConclusao;
	}
	public void setDataDeConclusao(Date dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}
	public List<NotasTable> getNotas() {
		return notas;
	}
	public void setNotas(List<NotasTable> notas) {
		this.notas = notas;
	}
	
	

}
