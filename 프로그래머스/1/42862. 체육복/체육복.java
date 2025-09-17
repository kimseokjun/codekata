import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       int answer = n;
        int loststudent = lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 들고왔는데 원래 옷 뺏김
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    loststudent--;
                }
            }
        }



        //인접한 애들한테서 옷빌리기
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    loststudent--;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }

        }
        return answer-loststudent;
    }
}