package com.cursoceat.view;

import java.util.Scanner;
import com.cursoceat.model.*;

public class Inicio {
	
	static Scanner keyboard = new Scanner(System.in);
	public void configuracionInicial() {
		System.out.println("Nombre de la empresa: ");
		String nEmp = keyboard.next();
		Empresa miEmp = new Empresa(nEmp);
	}
}
