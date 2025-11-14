import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();

		if(a == 0 ){
			System.out.println(1);
		}else{
			System.out.println(factorial(a));
		}
	}

	public static long factorial(long n){
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}
}