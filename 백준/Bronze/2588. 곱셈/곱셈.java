import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int first =  sc.nextInt();
		int second = sc.nextInt();
		int ones = second % 10;
		int tens = (second / 10) % 10;
		int hundreds = second / 100;

		System.out.println(first * ones);
		System.out.println(first * tens);
		System.out.println(first * hundreds);
		System.out.println(first*second);

	}
}
