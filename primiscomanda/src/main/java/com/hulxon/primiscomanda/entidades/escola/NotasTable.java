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
	


}
