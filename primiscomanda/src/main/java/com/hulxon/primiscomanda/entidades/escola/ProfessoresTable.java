package com.hulxon.primiscomanda.entidades.escola;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@OneToOne
	@JoinColumn(name = "idMateria")
	private MateriasTable materia;

}
