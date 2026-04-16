package primerasclases;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(3, 4, "verde");
		System.out.printf("Rectángulo %s de %d x %d%n", r1.color,  r1.base, r1.altura );
		

		Rectangulo r2 = new Rectangulo(3, 4);
		System.out.printf("Rectángulo %s de %d x %d%n", r2.color,  r2.base, r2.altura );
		

		Rectangulo r3 = new Rectangulo();
		System.out.printf("Rectángulo %s de %d x %d%n", r3.color,  r3.base, r3.altura );
	}

}
