import java.util.Random;

class Program {

	public static void main(String[] args) {

		Random random = new Random();

		int array[] = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {

			array[i] = random.nextInt();
			sum += array[i];
			System.out.println(array[i]);
		}

		System.out.println(sum);
	}
}