import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
             int[] challenger = new int[N + 2];  //stages는 1부터 시작하고 N보다 하나 큰 stages이므로
        for (int stage : stages) {
            challenger[stage] += 1;    //각 스테이지의 인원수
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.0);
            } else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }

        List<Integer> keyList = new ArrayList<>(fails.keySet());
        keyList.sort((a, b) -> Double.compare(fails.get(b), fails.get(a)));




        int [] answer = new int[N];
        for(int i=0; i<N; i++){
            answer[i] = keyList.get(i);
        }
        return answer;
    }
    
}