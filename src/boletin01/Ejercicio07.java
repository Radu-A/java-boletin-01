package boletin01;

public class Ejercicio07 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i+=100) {
			count+=1;
			sum+=i;
		}

		System.out.printf("La suma de los " + count + " elementos pedidos es " + sum);
		System.out.printf("La suma de los XX elementos pedidos es yy.");
	}

}
