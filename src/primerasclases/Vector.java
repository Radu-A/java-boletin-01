package primerasclases;

public class Vector {
	private int x;
	private int y;
	
	public Vector (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector (int value) {
		this.x = value;
		this.y = value;
	}
	
	public Vector (Vector copy) {
		this.x = copy.x;
		this.y = copy.y;
	}
	
	public void show() {
		System.out.printf("Vector de coordenadas (%d, %d)%n", this.x, this.y);
	}
}
