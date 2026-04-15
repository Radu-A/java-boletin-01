package boletin02;

public class Ejercicio07 {

	public static void main(String[] args) {
		int[] numArray = {3, 5, 7, 2, 8};
		int max = 0;
		
		for (int num : numArray) {
			if (num > max) max = num;
		}
		
		System.out.println("El número máximo es: " + max);
	}

}
