package condingtest;

import java.util.Arrays;
import java.util.TreeSet;

public class P03 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{2,1,3,4,1});
        System.out.println(Arrays.toString(result));
    }

     private static int[] solution(int[] arr) {

        TreeSet<Integer> treeset = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // ✅ i+1부터 시작
                treeset.add(arr[i] + arr[j]);
            }
        }
        int [] result = new int[treeset.size()];
        int i = 0;
        for(int num : treeset){

            result[i++] = num;
            
        }
        return result;
     }
}
