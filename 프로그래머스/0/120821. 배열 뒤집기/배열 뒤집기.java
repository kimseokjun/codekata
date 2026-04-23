import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> list = new ArrayList<>();
        
        int origin_len = num_list.length;
        
        
        for(int i = origin_len-1; i >= 0 ; i--){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}