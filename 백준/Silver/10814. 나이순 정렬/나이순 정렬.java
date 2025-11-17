import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String [][] members = new String[N][2];

		for (int i = 0; i < N; i++) {
			String [] input =  sc.nextLine().split(" ");
			members[i][0] = input[0]; // 나이
			members[i][1] = input[1]; // 이름
		}

		Arrays.sort(members, (o1, o2) -> {
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});

		for (String[] member : members) {
			System.out.println(member[0] + " " + member[1]);
		}



	}

}
