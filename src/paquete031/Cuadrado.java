package paquete031;

public class Cuadrado extends Figura {
	
	private int l;
	
	public Cuadrado(String color, int l) {
		super(color);
		this.l = l;
	}

	@Override
	public int area() {
		return l * l;
	}

	@Override
	public int perimetro() {
		return 4 * l;
	}

}
