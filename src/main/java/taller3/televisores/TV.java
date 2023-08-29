package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	static int numTV;

	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		TV.numTV++;
		this.canal=1;
		this.volumen=1;
		this.precio=500;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}

	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		if(estado == false && volumen>= 0 && volumen<=7) {
		this.volumen=volumen;
		}
	}
		
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if (estado==false && canal >=1 && canal<=120) {
		this.canal=canal;
		}
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
//------------------------------------------------------
	public void canalUp() {
		this.setCanal(canal+1);
	}
	
	public void canalDown() {
		this.setCanal(canal-1);
	}
//----------------------------------------------------------
	
	public void volumenUp() {
		this.setCanal(volumen+1);
	}
	
	public void volumenDown() {
		this.setCanal(volumen-1);
	}
//----------------------------------------------
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
}
