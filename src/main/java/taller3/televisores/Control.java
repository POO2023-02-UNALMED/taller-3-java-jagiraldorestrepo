package taller3.televisores;

public class Control {
	
	 TV tv;
	
	
	
	
	public void enlazar(TV tv) {
		
		this.tv = tv;
		tv.control = this; //esto hace que el tv y el control queden apuntando al mismo objeto 
		
	}
	
	
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	/*public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}*/
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
