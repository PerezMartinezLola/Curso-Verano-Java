package _15_interfaces;

public class Mosquito extends Animal implements Volador{
	private int velocidad;
	
	
	@Override
	public boolean despegar() {
		if(velocidad > 0) {
			return true;
		}
		return false;
	}


	@Override
	public boolean aterrizar() {
		if(velocidad == 0) {
			return true;
		}
		return false;
	}


	@Override
	public boolean planear(int metros) {
		// TODO Auto-generated method stub
		return false;
	}

}
