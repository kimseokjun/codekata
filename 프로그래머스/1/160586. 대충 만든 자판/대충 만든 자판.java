import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
 int[] answer = new int[targets.length];//targets 배열 길이만큼

        for(int i = 0; i < targets.length; i++){
            String target = targets[i]; //타켓 배열의 원소 접근
            int sum = 0;
            for(int j = 0; j < target.length(); j++){
                char c = target.charAt(j);//타겟의 문자들 하나씩 봐야지
                int min = Integer.MAX_VALUE;

                for(String key : keymap){ //keymap에 있는 애들 하나씩 꺼내서 문자 하나씩 비교해봐야지
                    int index = key.indexOf(c); //key에서 c가 몇번째 인덱스에 있는지? 인덱스 0부터 올라가는거 생각하기
                    if(index != -1){ // 찾으려는 문자가 존재한다!
                        min = Math.min(min,index+1); //더 작은 횟수로 갱신
                    }
                }
                if (min == Integer.MAX_VALUE) { // MAX_VALUE라는 것은 찾으려는 문자가 없었다는 뜻
                    // 어느 keymap에도 없는 글자라면 실패
                    sum = -1;
                    break; // 더 볼 필요 없음
                } else {
                    sum += min; // 최소 횟수 더하기
                }

            }
            answer[i] = sum;
        }

        return answer;
    }
}
