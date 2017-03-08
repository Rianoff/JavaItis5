import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int sum = 0;

		boolean b = false;

		do {

			a = scanner.nextInt();

			if (b) {

				sum += a;
				b = false;
			}

			else b = true;

		} while (-1 != a);

		System.out.println(sum);
	}
}