import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int sum = 0;
		int b = 0;

		do {

			a = scanner.nextInt();

			if (a > 0) { 

				if (b == 0) b = a;
				else b *= a;
			}

			if (0 != a % 2) {

				sum += a;
			}

			
		} while (-1 != a);


		System.out.printf("\nResult: %d %d \n", b, sum);
	}
}