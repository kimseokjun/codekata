
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        //a[0]인애들을 움직여서 가장 작은애가 a[1]의 가장 큰 값의 열로 움직여야함
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int sum =0;

        for(int i=0;i<n;i++){ sum += a[i]*b[i];}

        System.out.println(sum);
    }
}
