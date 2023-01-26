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
	

}
