package SRPsolution;

import SRPviolation.*;
import ISPviolation.Maquinaria;

public class Maquina{
	//La interface dentro de ISPviolation tiene metodos que esta clase tiene.
	//Despues de solucionar las violaciones de principios en este paquete y en el otro
	//puede relacionar sus clases e interfaces resultantes.
	
	private double energiaRestante; //Valor entre 00.00 y 100.00
	
	public Maquina() {
		this.energiaRestante = 100.00;
	}
	
	public Maquina(double energiaRestante) {
		this.energiaRestante = energiaRestante;
	}
		
}