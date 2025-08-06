class Solution {
    public int solution(int n, int m, int[] section) {
       int answer = 0;
        int len = section.length;
        int end = 0;

        for(int i = 0; i<len; i++){
            if(section[i] <= end){
                continue;
            }
            end = section[i] + m -1;
            answer ++;
        }
//        if((section[len-1]-section[0] < m)){
//            return 1;
//        }

        return answer;
    }
}