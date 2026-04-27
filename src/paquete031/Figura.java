package paquete031;

public abstract class Figura {
	
	private String color;
	
	protected Figura(String color) {
		this.color = color;
	}
	
	protected abstract int area();
	
	protected abstract int perimetro();
	
	protected void show() {
		System.out.printf("%s %s de %d de área, %d de perímetro%n", this.getClass().getSimpleName(), this.getColor(), this.area(), this.perimetro());
	}
	
	protected String getColor() {
		return this.color;
	}
}
