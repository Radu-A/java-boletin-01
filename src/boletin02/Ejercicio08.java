package boletin02;

public class Ejercicio08 {

	public static void main(String[] args) {
		int[] numArray = {3, 5, 7, 2, 8};
		int min = 10;
		
		for (int num : numArray) {
			if (num < min) min = num;
		}
		
		System.out.println("El número míninmo es: " + min);
	}

}
