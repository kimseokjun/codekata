import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];

		for (int i = 0; i<3; i++){
			arr[i] = sc.nextInt();
		}

		int A = arr[0];
		int B = arr[1];
		int C = arr[2];
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) *((B%C))%C));


	}
}
