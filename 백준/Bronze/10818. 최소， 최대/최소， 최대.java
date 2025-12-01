import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		System.out.println(list.get(0) + " " + list.get(list.size() - 1));
	}

}