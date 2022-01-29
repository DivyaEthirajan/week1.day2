package week1.day2;

public class PrintNum1to100 {

	public static void main(String[] args) {
		int sum = 0;
		// print numbers 1 to 100
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		// print odd numbers 1 to 100
		for (int j = 1; j <= 100; j++) {
			int k = j % 2;

			if (k != 0) {
				System.out.println(j);
				;
			}
		}
		// Print the squares of the even number from 59 - 38
		int a = 38;
		while (a <= 59) {
			int b = a % 2;
			if (b == 0)
				System.out.println(a + "the square is " + a * a);

			a++;
		}

		// write a program to get sum of the numbers.
		for (int c = 1; c <= 5; c++)

			sum = sum + c;
		System.out.println(sum);

	}
}