package bucles;

public class Ejercicio06 {

	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		int pow = 1;
		
		for (int i = 1; i <= b; i++) {
			pow*=b;
		}
		System.out.println(pow);
		System.out.println(Math.pow(a, b));
	}

}
