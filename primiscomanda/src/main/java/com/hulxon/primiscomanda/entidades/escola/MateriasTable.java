package com.hulxon.primiscomanda.entidades.escola;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "materias", schema = "escola")
public class MateriasTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMateria;
	@ManyToMany(mappedBy = "materias")
	private List<ProfessoresTable> professores;
	private String nome;
	private Integer cargaHoraria;
	@OneToMany
	@JoinColumn(name="idMateria")
	private List<NotasTable> notas;

	public Long getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}
	public List<ProfessoresTable> getProfessores() {
		return professores;
	}
	public void setProfessores(List<ProfessoresTable> professores) {
		this.professores = professores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public List<NotasTable> getNotas() {
		return notas;
	}
	public void setNotas(List<NotasTable> notas) {
		this.notas = notas;
	}
	
	
	
}
