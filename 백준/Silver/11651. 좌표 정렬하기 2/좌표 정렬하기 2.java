import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // x좌표
            int y = sc.nextInt(); // y좌표
            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr,(o1,o2) ->{

            if(o1[1]!=o2[1]){
                return o1[1]-o2[1];
            }else {
                return o1[0]-o2[0];
            }
        });


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }
}