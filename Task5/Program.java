import java.util.Scanner;

class Program {

	private static int getNumericSum(int a) {

		int sum = 0;

		while (a != 0) {

			sum += a % 10;
			a /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int sum = 0;
		int b = 0;

		do {

			a = scanner.nextInt();

			sum = Program.getNumericSum(a);

			if (7 == sum % 10) {

				if (b == 0) b = a;
				else b *= a;
			}

		} while (-1 != a);

		System.out.println(b);
	}
}