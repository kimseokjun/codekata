class Solution {
public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) { // j가 i의 약수일 때
                    count++;
                    if (j != i / j) { // j와 i/j가 다르면, i/j도 약수
                        count++;
                    }
                }
            }

            if (count > limit) { //약수의 개수 = 공격력 이 제한수치 보다 큰경우
                answer += power;// 지정해준 무기로 설정
            } else {
                answer += count;
            }
        }
        return answer;
    }
}