import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		long N = Long.parseLong(str[0]);
		long X = Long.parseLong(str[1]);

		if (N == X) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}