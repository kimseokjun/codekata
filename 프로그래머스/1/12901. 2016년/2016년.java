class Solution {
    public String solution(int a, int b) {
        String [] Days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int [] monthday = {31,29,31,30,31,30,31,31,30,31,30,31};
        String answer = "";
        int totaldays = 0;

        for(int i = 0; i < a-1; i++){
            totaldays += monthday[i];
        }

        answer = Days[(totaldays + b-1)%7];
        return answer;
    }
}