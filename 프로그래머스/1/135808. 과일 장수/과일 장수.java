import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
            int answer = 0;
        Arrays.sort(score);

        int forCount = score.length/m;
        for(int i = 0; i <forCount; i++){
            int minInBox = score[score.length-(i+1)*m];
            answer += minInBox * m;
        }
        return answer;
    }
}