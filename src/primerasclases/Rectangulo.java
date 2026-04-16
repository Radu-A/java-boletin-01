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
		this.base = base;
		this.altura = altura;
		this.color = "blanco";
	}
	
	public Rectangulo () {
		this.base = 1;
		this.altura = 1;
		this.color = "blanco";
	}
}
