package taller3.televisores;

public class Control {
	
	private TV tv;
	
	
	
	
	public void enlazar(TV tv) {
		
		this.tv = tv;
		tv.control = this; //esto hace que el tv y el control queden apuntando al mismo objeto 
		
	}
	
	
	
	public void turnON() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUP() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	
	public void setVolumen(int volumen) {
		tv.setCanal(volumen);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
