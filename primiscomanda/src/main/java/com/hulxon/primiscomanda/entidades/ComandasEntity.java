package com.hulxon.primiscomanda.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comandas", schema = "PrimisWork")
public class ComandasEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComanda;
	private Date data;
	private String aberta;
	private Integer valor;
	@ManyToOne
	@JoinColumn (name= "numMesa")
	private MesasEntity mesa;
	@ManyToOne
	@JoinColumn (name= "idfuncionario")
	private FuncionariosEntity funcionario;
	@ManyToOne
	@JoinColumn (name= "idCliente")
	private ClientesEntity cliente;
	@OneToMany
	@JoinColumn (name= "idComanda")
	private List<ItensComandaEntity> itens;

	public Long getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Long idComanda) {
		this.idComanda = idComanda;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAberta() {
		return aberta;
	}

	public void setAberta(String aberta) {
		this.aberta = aberta;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public MesasEntity getMesa() {
		return mesa;
	}

	public void setMesa(MesasEntity mesa) {
		this.mesa = mesa;
	}

	public FuncionariosEntity getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionariosEntity funcionario) {
		this.funcionario = funcionario;
	}

	public ClientesEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClientesEntity cliente) {
		this.cliente = cliente;
	}

	public List<ItensComandaEntity> getItens() {
		return itens;
	}

	public void setItens(List<ItensComandaEntity> itens) {
		this.itens = itens;
	}
	
	
		
}
