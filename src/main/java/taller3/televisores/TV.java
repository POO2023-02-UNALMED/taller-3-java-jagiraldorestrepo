package taller3.televisores;

public class TV {
	
	//Atributos----------------------------------------------------------------
	
	private Marca marca;
	private int canal = 1;
	private int volumen = 1;
	private int precio = 500;
	private boolean estado; //encendido true, apagado false
	Control control;
	
	private static int numTV; //conteo de televisores creados
	
	
	//constructor--------------------------------------------------------------
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		numTV++; //conteo de televisores cada que creo un objeto 
		
		
		}
	
	//métodos------------------------------------------------------------------
	
	//encendido
	public void turnOn() {
		estado = true;
	}
	
	
	public void turnOff() {
		estado = false;
	}
	
	//-------------------------------------------------------------------
	//cambiar canal
	public void canalUp() {
		if (estado!=true || canal==120) {
			return;
		}
		canal++;
	}
	
	public void canalDown() {
		if (estado!=true || canal==0) {
			return;
		}
		canal--;
	}
	
	//----------------------------------------------------------------
	//cambiar volumen
	
	public void volumenUp() {
		if (estado!=true || volumen==7) {
			return;
		}
		volumen++;
	}
	
	public void volumenDown() {
		if (estado!=true || volumen==0) {
			return;
		}
		volumen--;
	}
	
	
	
	
	//getters and setters------------------------------------------------------

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (estado!=true || canal>120 || canal<1) {
			return;
		}
		this.canal=canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
	
	


