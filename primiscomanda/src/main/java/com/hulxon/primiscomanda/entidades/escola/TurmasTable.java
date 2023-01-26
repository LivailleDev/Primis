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
	
}
