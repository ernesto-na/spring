package com.novellius;

import org.springframework.beans.factory.annotation.Autowired;

public class Administrador {

	private Integer idAd;
	private String nombre;
	
	//@Autowired
	private Direccion direccion;
	
	
	@Autowired
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		System.out.println("Encino 201");
	}

	public void setIdAd(Integer idAd) {
		this.idAd = idAd;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Administrador() {
		super();
	}


	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	public Administrador(Integer idAd, String nombre) {
		super();
		this.idAd = idAd;
		this.nombre = nombre;
	}
		
}
