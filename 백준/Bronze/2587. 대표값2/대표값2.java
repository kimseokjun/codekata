import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int NUM = 5;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		int [] arr = new int[NUM];
		for(int i=0;i<NUM;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);

		System.out.println(sum/NUM);
		System.out.println(arr[2]);
	}

}
