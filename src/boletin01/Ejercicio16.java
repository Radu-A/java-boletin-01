package boletin01;

public class Ejercicio16 {

	public static void main(String[] args) {
		int sum = 10;
		for (int i = 10; i > 1; i--) {
			sum *= (i-1);
		}
		System.out.printf("El factorial de 10 es %d.", sum);
	}

}
