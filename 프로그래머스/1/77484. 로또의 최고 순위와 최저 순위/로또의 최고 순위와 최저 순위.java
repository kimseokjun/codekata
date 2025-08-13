class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
     int countZero = 0;
        int count = 0;
        for(int i = 0; i < win_nums.length; i++){
            if(lottos[i] != 0){
                countZero++; // 나중에 6에서 countZero를 빼서 0의 개수를 구할거임
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        count++;//일단 모르는 번호를 제외하고 몇 개맞는지 확인
                        break;
                    }
                }
            }
        }
        countZero = 6 - countZero; //0의 개수
        int min = count + 0; // 가려진 수가 하나도 맞지 않은경우
        int max = count + countZero; // 가려진 수 모두 당첨 번호 일 경우

        return new int[]{deungsu(max),deungsu(min)};

    }

    public static int deungsu(int a){
        if(a == 6){
            return 1;
        }
        else if(a ==5){
            return 2;
        }
        else if(a ==4){
            return 3;
        }
        else if(a ==3){
            return 4;
        }
        else if(a ==2){
            return 5;
        }
        else{
            return 6;
        }
    }
}