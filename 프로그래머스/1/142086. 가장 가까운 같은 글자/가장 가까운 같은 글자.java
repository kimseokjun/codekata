import java.util.*;

class Solution {
    public int[] solution(String s) {
         int[] answer = new int[s.length()];
        int check =0;

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c =  s.charAt(i);
            if(!map.containsKey(c)){
                answer[i] = -1;
            }else{
                answer[i] = i - map.get(c);
            }
            map.put(c,i);
        }
        System.out.println(map);
        return answer;
    }
}