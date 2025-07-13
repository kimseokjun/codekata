class Solution {
    public String solution(String s) {
    String answer = "";
        int index = 0; //공백을 기준으로 해줘야하기 때문에 기준값

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' '){
                answer += c;
                index =0;
            }else if(index % 2 == 0){
                answer += Character.toUpperCase(c);
                index++;
            }else if(index % 2 == 1){
                answer += Character.toLowerCase(c);
                index++;
            }


        }
        return answer;
    }
}