package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operador")
public class Operador {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	public Operador(int id, String apellidos, String nombre, int telefono) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Column(name="apellidos")
	private String apellidos;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	private int telefono;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Operador() {
		
	}
}

