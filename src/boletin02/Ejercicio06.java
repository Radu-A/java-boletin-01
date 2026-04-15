package boletin02;

public class Ejercicio06 {

	public static void main(String[] args) {
		int[] numArray = {1, 3, 5, 7};
		int[] resultArray = new int[numArray.length];
		
		for (int i = 0; i < numArray.length; i++) {
			resultArray[i] = numArray[i] * 2;
		}
		
		for (int num : resultArray) {
			System.out.printf("%d ", num);
		}
	}

}
