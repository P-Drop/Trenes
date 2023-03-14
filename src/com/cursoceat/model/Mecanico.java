package com.cursoceat.model;

public class Mecanico extends Empleado {
	
	private ESPECIALIDAD especialidad;
	
	public Mecanico() {
		super();
	}

	public Mecanico(String nombre, String dni, String telefono, double sueldo, ESPECIALIDAD especialidad) {
		super(nombre, dni, telefono, sueldo);
		this.especialidad = especialidad;
	}

	public ESPECIALIDAD getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(ESPECIALIDAD especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("La especialidad es: "+this.especialidad);
	}

	@Override
	public String toString() {
		return "Mecanico [especialidad=" + especialidad + ", nombre=" + nombre + ", dni=" + dni + ", telefono="
				+ telefono + ", sueldo=" + sueldo + "]";
	}
	
	
}
