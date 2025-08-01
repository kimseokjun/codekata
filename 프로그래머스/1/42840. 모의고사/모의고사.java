import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {1,2,3};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int person1count = 0;
        int person2count = 0;
        int person3count = 0;

        int [] result = {0,0,0};
        for(int i = 0; i < answers.length; i++){
            System.out.println("i = " + i);
            if(answers[i] == person1[i%person1.length]){
                result[0]++;
            }
            if(answers[i] == person2[i%person2.length]){
                result[1]++;
            }
            if(answers[i] == person3[i%person3.length]){
                result[2]++;
            }
        }

        int maxScore = Math.max((Math.max(result[0], result[1])),result[2]);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(maxScore == result[i]){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(x->x).toArray();
    }
}