class Solution {
    public int solution(String s) {
             int answer = 0;
        int same = 0;
        int dif = 0;
        char check = s.charAt(0);;
        //banana
        for(int i = 0; i < s.length(); i++){

            if(check == s.charAt(i)){
                same++;
            }else if(check != s.charAt(i)){
                dif++;
            }
            if(same == dif){
                answer++;
                same = 0;
                dif = 0;
                if(i != s.length()-1){
                    check = s.charAt(i+1);
                }
            }
        }

        if(same != 0){
            answer++;
        }
        return answer;
    }
}