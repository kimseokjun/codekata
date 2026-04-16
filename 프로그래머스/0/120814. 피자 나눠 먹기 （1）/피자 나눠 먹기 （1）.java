class Solution {
    public int solution(int n) {
        int answer = 0;
        // 피자 1판 -> 7조각
        // n명이 1조각 이상 먹어야함
        if(n % 7 == 0){
            answer = n / 7;
        }else{
            answer = (n/7) +1;
        }
        return answer;
    }
}