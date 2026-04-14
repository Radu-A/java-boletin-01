package boletin01;

public class Ejercicio09 {

	public static void main(String[] args) {
		double num = 7.0;
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % num == 0) {
				count++;
			}
		}
		System.out.println("La cantidad de multiplos de 7 entre 1 y 200 es " + count);
	}

}
