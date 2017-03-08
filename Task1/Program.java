import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a[] = {5000, 1000, 500, 100, 50, 10, 5, 2, 1};

		int b = scanner.nextInt();

		int c = 0;

		while (c < a.length) {

			int d = b / a[c];
				
				System.out.printf("%d - %d \n", a[c], d);

			b = b - d * a[c];

			c++;
		}
	}
}