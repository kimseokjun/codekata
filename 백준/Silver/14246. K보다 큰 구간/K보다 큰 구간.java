import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
		long k = sc.nextLong(); // k도 long으로

		int start = 0;
		int end = 0;
		long sum = 0L;    // 합은 long
		long count = 0L;  // 결과도 long

		// 여기서는 end를 "exclusive"로 취급: sum = nums[start] + ... + nums[end-1]
		while (true) {
			if (sum > k) {
				// 현재 sum(= nums[start..end-1])이 k보다 크면,
				// start로 시작하는 구간 중 끝이 end-1, end, ..., n-1 인 것들이 모두 유효
				// 개수 = n - (end-1) = n - end + 1
				count += (long)(n - end + 1);
				sum -= nums[start];
				start++;
			} else {
				// sum <= k
				if (end == n) break; // 더 이상 확장 불가하면 종료
				sum += nums[end];
				end++;
			}
		}

		System.out.println(count);
		sc.close();
	}
}
