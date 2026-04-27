package paquete031;

public class Rectangulo extends Figura {
	
	private int b;
	private int a;
	
	public Rectangulo(String color, int b, int a) {
		super(color);
		this.b = b;
		this.a = a;
	}

	@Override
	public int area() {
		return b * a;
	}

	@Override
	public int perimetro() {
		return 2 * (b + a);
	}

}
