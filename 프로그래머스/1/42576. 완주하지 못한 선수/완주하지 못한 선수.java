import java.util.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();


        //반복문을 통해 참가자 배열 순회
        for(String p : participant){

                //1. 참가자를 map에 저장 2. 이미 존재하면 +1시키기
                map.put(p, map.getOrDefault(p,0)+1);
        }

        //반복문을 통해 완주자 배열 순회
        for(String c : completion){
            // 있으면 이름의 값에서 -1하기
            map.put(c, map.get(c)-1);
        }

        for(String k : map.keySet()){
            if(map.get(k) != 0){
                answer = k;
            }
        }

        return answer;
    }
}