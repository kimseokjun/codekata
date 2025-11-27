import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		int findNum = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == findNum) {
				count++;
			}
		}

        System.out.println(count);
	}

}