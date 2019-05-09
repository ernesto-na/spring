package com.novellius;

public class Direccion {

	private String calle;
	private String cp;
	
	
	public Direccion() {
		super();
	}

	public Direccion(String calle, String cp) {
		super();
		this.calle = calle;
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", cp=" + cp + "]";
	}
	
	
}
