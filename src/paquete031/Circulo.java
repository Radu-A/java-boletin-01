package paquete031;

public class Circulo extends Figura {
	
	private int r;
	
	public Circulo(String color, int r) {
		super(color);
		this.r = r;
	}
	
	public void show() {
		super.show();
		System.out.printf(" y %d de radio", this.r);
	}

	@Override
	protected int area() {
		return  (int)(Math.PI * r * r);
	}

	@Override
	protected int perimetro() {
		return (int)(2 * Math.PI * r);
	}

}
