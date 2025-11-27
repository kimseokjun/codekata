import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);

		String[] arr1 = br.readLine().split(" ");

		int[] arr2 = new int[N];

		for (int i = 0; i < N; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
			if (arr2[i] < X) {
				System.out.print(arr2[i] + " ");
			}
		}

	}

}