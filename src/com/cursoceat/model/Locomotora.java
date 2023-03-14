package com.cursoceat.model;

public class Locomotora {

	String matricula;
	private int potencia;
	private int anioFabricacion;
	Empleado mecanicoResp;
	
	public Locomotora(String matricula, int potencia, int anioFabricacion, Empleado emp) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anioFabricacion = anioFabricacion;
		this.mecanicoResp = emp;
	}
	
	public Locomotora() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public Empleado getResponsable() {
		return mecanicoResp;
	}

	public void setResponsable(Mecanico responsable) {
		this.mecanicoResp = responsable;
	}
	
	
}
