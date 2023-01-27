package com.hulxon.primiscomanda.entidades.escola;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="professores", schema="escola")
public class ProfessoresTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProfessor;
	private String nome;
	private Date admissao;
	private String cpf;
	@ManyToMany
	@JoinTable
	(
			name = "professores_materias",
			joinColumns = @JoinColumn
			(
					name="id_materia"
			),
			inverseJoinColumns = @JoinColumn
			(
					name="id_professsor"					
			)
	)
	private List<MateriasTable> materias;
	public Long getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<MateriasTable> getMaterias() {
		return materias;
	}
	public void setMaterias(List<MateriasTable> materias) {
		this.materias = materias;
	}
	
}
