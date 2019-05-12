package com.novellius.pojo;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

public class Admin {

	private Integer idAd;
	private String nombre;
	private String cargo;
	private Timestamp fechaCreacion;
	public Integer getIdAd() {
		return idAd;
	}
	public void setIdAd(Integer idAd) {
		this.idAd = idAd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", cargo=" + cargo + ", fechaCreacion="
				+ fechaCreacion + "]";
	}
	
	
			
}
