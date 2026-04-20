package bucles;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num = 538;
		int length = 1;
		int acc = 0;
		
		// method "a"
		for (int i = 10; i < num; i*=10) {
			length = i;
		}
		for (int i = length; i > 0; i/=10) {
			int digit = num/i;
			acc+=digit;
			num-=digit*i;
		}
		System.out.println(acc);
		acc = 0;
		num = 538;
		
		// method "b"
		for (int i = 10; i <= num * 10; i*=10) {
			int digit = (num % i) * 10 / i;
			acc+=digit;
			num-=digit;
		}
		System.out.println(acc);
		acc = 0;
		num = 538;
		
		// method "c"
		while (num > 0) {
			int digit = num % 10;
			acc+=digit;
			num/=10;
		}
		System.out.println(acc);
		acc = 0;
		num = 538;
	}

}
