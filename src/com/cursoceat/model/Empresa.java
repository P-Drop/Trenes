package com.cursoceat.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	
	String nombreEmpresa;
	ArrayList<Empleado> miPersonal = new ArrayList<>();
	ArrayList<Tren> misTrenes = new ArrayList<>();
	static Scanner keyboard = new Scanner(System.in);
	private final int indexJefe = 0;
	private final int indexMec = 1;
	private int indexMaqui;
	
	public Empresa(String nom) {
		this.nombreEmpresa = nom;
		crearEmpleados();
		mostrarEmpleados();
		crearTren();
		mostrarTren();
	}
	
	public void crearEmpleados() {
		JefeEstacion boss = new JefeEstacion("PdRulez", "005X", "033", 2000000);
		miPersonal.add(boss);
		System.out.println("Numero de mecanicos -> ");
		int numMec = keyboard.nextInt();
		for(int i=0; i<numMec;i++) {
			Mecanico robot = new Mecanico("Juliana", "83489J", "0021", 70000, ESPECIALIDAD.HIDRAULICA);
			miPersonal.add(robot);
		}
		this.indexMaqui = numMec+1;
		System.out.println("Numero de maquinistas -> ");
		int numMaki = keyboard.nextInt();
		for(int i=0; i<numMaki;i++) {
			Maquinista maki = new Maquinista("Rigoberto", "83489P", "89896", 5600, "Capitán General");
			miPersonal.add(maki);
		}
	}
	
	public void mostrarEmpleados() {
		for (Empleado e : miPersonal) {
			e.mostrarDatos();
		}
	}
	
	public void crearTren() {
		System.out.println("Numero de trenes -> ");
		int numTrenes = keyboard.nextInt();
		for(int i=0; i<numTrenes;i++) {
			Locomotora loca = new Locomotora("1234-S", 860, 2033, miPersonal.get(indexMec));
			Tren miTren = new Tren(loca, miPersonal.get(indexMaqui));
			System.out.println("Numero de vagones -> ");
			int numVag = keyboard.nextInt();
			for (int j=0; j<numVag; j++) {
				miTren.agregarVagon(20000, 13000, "puros");
			}
			misTrenes.add(miTren);	
		}
	}
	public void mostrarTren() {
		for (Tren t : misTrenes) {
			t.mostrarTren();
		}
	}
	
}
