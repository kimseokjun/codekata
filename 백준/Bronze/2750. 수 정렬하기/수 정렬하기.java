import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		Arrays.sort(arr);

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

}
