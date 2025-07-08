package condingtest;

public class p33 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    static public int solution(int left, int right) {
        int answer = 0;
        int divisor = 0;    //약수의 개수를 받을 변수
        for (int i = left; i <= right; i++) {
            divisor = 0;    //0으로 초기화 (다음 값의 약수 개수를 새로 받기 위함)
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                }
            }
            if ((divisor % 2) == 0) {   //짝수냐
                answer += i;
            } else {
                answer -= i;
            }
        }
            return answer;
        }
}



