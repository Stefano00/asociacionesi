package com.eductecno.asociacionesI.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="direccion")
public class Direccion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String calle;
	private int numero;
	private String ciudad;
	@Enumerated(EnumType.STRING)
	private TipoDireccion tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public TipoDireccion getTipo() {
		return tipo;
	}
	public void setTipo(TipoDireccion tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Calle: " + calle + ", Numero: " + numero + ", Ciudad: " + ciudad + ", Tipo: "
				+ tipo;
	}
	
	

}
