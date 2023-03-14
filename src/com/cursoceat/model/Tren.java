package com.cursoceat.model;

public class Tren {

	Locomotora locomotora;
	Vagon [] vagones;
	Empleado maquinista;
	private int numVagones;
	
	public Tren(Locomotora locomotora, Empleado maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		vagones = new Vagon[5];
		this.numVagones = 0;
	}
	
	public void agregarVagon(int cargaMaxima, int cargaActual, String mercancia ) {
		if(this.numVagones>=5) {
			System.out.println("No se pueden cargar más vagones");
		}
		else {
			Vagon v = new Vagon(this.numVagones,cargaMaxima,cargaActual,mercancia);
			vagones[numVagones]=v;
			this.numVagones++;
		}
	}
	
	public void mostrarTren() {
		System.out.println("El tren tiene "+this.numVagones+" vagones.");
		System.out.println("Los vagones tienen: ");
		
		for(int i=0; i<this.numVagones;i++) {
			System.out.println("Carga Actual: "+vagones[i].cargaActual);
			System.out.println("Carga Maxima: "+vagones[i].cargaMax);
			System.out.println("Mercancia: "+vagones[i].mercancia);
			System.out.println("Maquinista: "+maquinista.getNombre());
			System.out.println("Locomotora: "+locomotora.getMatricula());
		}
		}
	
	
}
