class Solution {
    public int solution(int[] nums) {
int answer = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    count = 0;
                    for(int l = 1; l <=(nums[i] + nums[j] +nums[k]); l++){
                        if((nums[i] + nums[j] +nums[k])%l==0){
                            count++;
                        }
                    }
                    if(count == 2){
                        answer ++;
                    }
                }
            }
        }

        return answer;
    }
}