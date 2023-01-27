package com.hulxon.primiscomanda.entidades.escola;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "turmas", schema = "escola")
public class TurmasTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String turno;
	private Integer sala;
	@OneToMany
	@JoinColumn(name = "idTurma")
	private List<AlunosTable> alunos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Integer getSala() {
		return sala;
	}
	public void setSala(Integer sala) {
		this.sala = sala;
	}
	public List<AlunosTable> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<AlunosTable> alunos) {
		this.alunos = alunos;
	}
	
}
