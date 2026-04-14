package boletin01;

public class Ejercicio08 {

	public static void main(String[] args) {
		double num = 5.0;
		int acc = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % num == 0) {
				acc+=i;
			}
		}
		System.out.println("La suma de los multiplos de 5 entre 1 y 100 es " + acc);
	}

}
