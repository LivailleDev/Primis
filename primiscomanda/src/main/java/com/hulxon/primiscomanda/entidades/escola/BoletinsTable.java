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
	
	

}
