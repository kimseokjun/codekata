import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();

		char[] digits = line.toCharArray();

		Arrays.sort(digits);

		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			sb.append(digits[i]);
		}
		System.out.println(sb.toString());
	}

}