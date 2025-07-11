class Solution {
    public int[] solution(int n, int m) {
        int [] answer = new int [2];
        for(int i =1; i<=n && i<=m; i++ ) {
            if(n % i == 0&& m % i == 0){
                answer[0] = i;
            }
        }
        //두수의 곱을 최대공약수로 나누면 최소공배수
        answer[1] = n * m / answer[0];
        return answer;
    }
}