package com.hulxon.primiscomanda.entidades.escola;

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
@Table(name = "materias", schema = "escola")
public class MateriasTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne(mappedBy = "materia")
	private ProfessoresTable professor;
	private String nome;
	private Integer cargaHoraria;
	@OneToMany
	@JoinColumn(name="idMateria")
	private List<NotasTable> notas;
}
