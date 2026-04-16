package primerasclases;

public class Rectangulo {
	int base;
	int altura;
	String color;
	
	public Rectangulo (int base, int altura, String color) {
		this.base = base;
		this.altura = altura;
		this.color = color;
	}
	
	public Rectangulo (int base, int altura) {
		this(base, altura, "blanco");
	}
	
	public Rectangulo() {
		this(1, 1, "blanco");
	}
	
	public void show() {
		System.out.printf("Rectángulo %s de %d x %d%n", this.color,  this.base, this.altura );
	}
}
