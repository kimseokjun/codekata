import java.util.Arrays;


class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        String answer = "";
        Arrays.sort(chars);     //일단 정렬부터 그러면 오름차순
                                //대문자는 소문자보다 원래 작음
        for (int i = 0; i < chars.length; i++) {
            answer += chars[chars.length - 1 - i];  
        }
        return answer;
    }
}