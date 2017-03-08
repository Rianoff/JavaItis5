import java.util.Random;

class Program {

	public static void main(String[] args) {

		Random random = new Random();

		int a[] = new int[10];
		int max_count = 0;

		for (int i = 0; i < 10; i++) {

			a[i] = random.nextInt();
			System.out.println(a[i]);
		}

		for (int i = 1; i < 9; i++) {

			if (    (a[i-1] <= a[i]) 
				 && (a[i+1] <  a[i]) ) max_count++;
			
		}

		System.out.println(max_count);
	}
}