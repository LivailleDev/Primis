package com.hulxon.primiscomanda.entidades.escola;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notas",schema = "escola")
public class NotasTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "idMateria", nullable = false)
	private MateriasTable materia;
	private Integer avaliacao;
	private Double nota;
	@ManyToOne
	@JoinColumn(name = "idBoletim", nullable = false)
	private BoletinsTable boletim;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MateriasTable getMateria() {
		return materia;
	}
	public void setMateria(MateriasTable materia) {
		this.materia = materia;
	}
	public Integer getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public BoletinsTable getBoletim() {
		return boletim;
	}
	public void setBoletim(BoletinsTable boletim) {
		this.boletim = boletim;
	}
	


}
